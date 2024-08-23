package bdl.http;

import bdl.config.MyFantasyLeagueProperties;
import bdl.http.models.mfl.FreeAgents;
import bdl.http.models.mfl.MflLeagueInformation;
import bdl.http.models.mfl.MflRosterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Service
public class MyFantasyLeagueHttpService {

    private final RestTemplate restTemplate;
    private final MyFantasyLeagueProperties myFantasyLeagueProperties;

    public MyFantasyLeagueHttpService(RestTemplate restTemplate, MyFantasyLeagueProperties myFantasyLeagueProperties) {
        this.restTemplate = restTemplate;
        this.myFantasyLeagueProperties = myFantasyLeagueProperties;
    }

    private UriComponentsBuilder getBaseUriBuilder() {
        return UriComponentsBuilder.fromUriString(myFantasyLeagueProperties.getApiUrl())
                .path("/2024/export")
                .queryParam("L", myFantasyLeagueProperties.getLeagueId())
                .queryParam("User-Agent", myFantasyLeagueProperties.getUserAgent());
    }

    public MflLeagueInformation fetchMFLLeagueInfo() {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "league")
                .build();

        return restTemplate.getForEntity(uriComponents.toUri(), MflLeagueInformation.class).getBody();
    }

    public MflRosterResponse fetchRosters() {
        UriComponents uriComponents = getBaseUriBuilder()
                .queryParam("TYPE", "rosters")
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

}