package bdl.services;

import bdl.http.MyFantasyLeagueHttpService;
import bdl.http.models.mfl.LeagueFranchise;
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

    public List<String> allTeamIds(String leagueId) {
        MflLeagueInformation leagueInformation = httpService.fetchMFLLeagueInfo(leagueId);
        return leagueInformation.getLeagueFranchises().stream().map(LeagueFranchise::getId).toList();
    }

    public TeamRoster buildRosterByTeam(String teamId, String leagueId) {
        List<Player> playerList = httpService.fetchRosters(Optional.of(teamId)).getFranchises().get(0).getPlayers();
        SalaryInformation salaryInformation = httpService.fetchSalaryInformation();
        MflLeagueInformation leagueInformation = httpService.fetchMFLLeagueInfo(leagueId);
        return MflToBdlRosterMapper.mapMflDataToTeamRoster(teamId, playerList, salaryInformation, leagueInformation);
    }

    public List<TeamRoster> allRosters(String leagueId) {
        SalaryInformation salaryInformation = httpService.fetchSalaryInformation();
        MflLeagueInformation leagueInformation = httpService.fetchMFLLeagueInfo(leagueId);

        return allTeamIds(leagueId).stream()
                .map(teamId -> buildRosterByTeam(teamId, salaryInformation, leagueInformation))
                .toList();
    }

    private TeamRoster buildRosterByTeam(String teamId, SalaryInformation salaryInformation, MflLeagueInformation leagueInformation) {
        List<Player> playerList = httpService.fetchRosters(Optional.of(teamId)).getFranchises().get(0).getPlayers();
        return MflToBdlRosterMapper.mapMflDataToTeamRoster(teamId, playerList, salaryInformation, leagueInformation);
    }
}
