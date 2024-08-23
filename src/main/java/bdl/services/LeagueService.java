package bdl.services;

import bdl.http.MyFantasyLeagueHttpService;
import bdl.http.models.mfl.MflLeagueInformation;
import bdl.mappers.LeagueInformationMapper;
import bdl.models.LeagueInformation;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    private final MyFantasyLeagueHttpService httpService;

    public LeagueService(MyFantasyLeagueHttpService httpService) {
        this.httpService = httpService;
    }

    public LeagueInformation leagueData(String leagueId) {
        MflLeagueInformation mflLeagueInformation = httpService.fetchMFLLeagueInfo(leagueId);
        return LeagueInformationMapper.mapMflToBdl(mflLeagueInformation);
    }

}