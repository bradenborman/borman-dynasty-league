package bdl.services;

import bdl.http.MyFantasyLeagueHttpService;
import bdl.http.models.mfl.MflLeagueInformation;
import bdl.http.models.mfl.Player;
import bdl.http.models.mfl.SalaryInformation;
import bdl.mappers.MflToBdlRosterMapper;
import bdl.models.TeamRoster;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RosterService {

    private final MyFantasyLeagueHttpService httpService;

    public RosterService(MyFantasyLeagueHttpService httpService) {
        this.httpService = httpService;
    }

    public TeamRoster buildRosterByTeam(String teamId) {
        List<Player> playerlist = httpService.fetchRosters(Optional.of(teamId)).getFranchises().get(0).getPlayers();
        SalaryInformation salaryInformation = httpService.fetchSalaryInformation();
        MflLeagueInformation leagueInformation = httpService.fetchMFLLeagueInfo();


        return MflToBdlRosterMapper.mapMflDataToTeamRoster(teamId, playerlist, salaryInformation, leagueInformation);
    }

}