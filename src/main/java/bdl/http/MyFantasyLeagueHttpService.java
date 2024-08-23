package bdl.http;

import bdl.config.MyFantasyLeagueProperties;
import bdl.http.models.mfl.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Service
public class MyFantasyLeagueHttpService {

    private final RestTemplate restTemplate;
    private final XmlMapper xmlMapper;
    private final MyFantasyLeagueProperties myFantasyLeagueProperties;

    public MyFantasyLeagueHttpService(RestTemplate restTemplate, XmlMapper xmlMapper, MyFantasyLeagueProperties myFantasyLeagueProperties) {
        this.restTemplate = restTemplate;
        this.xmlMapper = xmlMapper;
        this.myFantasyLeagueProperties = myFantasyLeagueProperties;
    }

    private UriComponentsBuilder getBaseUriBuilder() {
        return UriComponentsBuilder.fromUriString(myFantasyLeagueProperties.getApiUrl())
                .path("/2024/export")
                .queryParam("L", myFantasyLeagueProperties.getLeagueId())
                .queryParam("User-Agent", myFantasyLeagueProperties.getUserAgent());
    }

    @Cacheable(value = "leagueInformation")
    public MflLeagueInformation fetchMFLLeagueInfo(String leagueId) {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "league")
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), MflLeagueInformation.class).getBody();
    }

    @Cacheable(value = "sharkPlayerRanks")
    public SharkPlayerRankings fetchSharkPlayerRanks(Optional<String> position) {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "playerRanks")
                .queryParamIfPresent("TYPE", position)
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), SharkPlayerRankings.class).getBody();
    }

    public SalaryInformation fetchSalaryInformation() {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "salaries")
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), SalaryInformation.class).getBody();
    }

    public String fetchMFLSchedule(Optional<String> week, Optional<String> franchiseID) {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "schedule")
                .queryParamIfPresent("W", week)
                .queryParamIfPresent("F", franchiseID)
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), String.class).getBody();
    }

    public MflRosterResponse fetchRosters(Optional<String> franchiseID) {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "rosters")
                .queryParamIfPresent("FRANCHISE", franchiseID)
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), MflRosterResponse.class).getBody();
    }

    public FreeAgents fetchFreeAgents(Optional<String> position) {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "freeAgents")
                .queryParamIfPresent("POSITION", position)
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), FreeAgents.class).getBody();
    }

    public LoginResponse attemptLogin(String username, String password) {
        MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("USERNAME", username);
        requestParams.add("PASSWORD", password);
        requestParams.add("XML", "1");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(requestParams, headers);

        ResponseEntity<String> apiResponse = restTemplate.postForEntity(myFantasyLeagueProperties.getApiUrl() + "/2024/login", httpEntity, String.class);
        LoginResponse loginResponse;
        try {
            loginResponse = xmlMapper.readValue(apiResponse.getBody(), LoginResponse.class);
        } catch (Exception e) {
            throw new AuthenticationException("Error parsing login response", e) {};
        }
        return loginResponse;

    }

}