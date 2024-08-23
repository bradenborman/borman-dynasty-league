package bdl.mappers;

import bdl.http.models.mfl.MflLeagueInformation;
import bdl.http.models.mfl.Player;
import bdl.http.models.mfl.SalaryInformation;
import bdl.models.TeamRoster;

import java.util.List;

public class MflToBdlRosterMapper {

    public static TeamRoster mapMflDataToTeamRoster(String teamId, List<Player> playerlist, SalaryInformation salaryInformation, MflLeagueInformation leagueInformation) {
        TeamRoster roster = new TeamRoster();

        List<bdl.models.Player> playerList = PlayerMapper.mapMflDataToBdl(playerlist, salaryInformation);

        roster.setTeamId(teamId);
        roster.setFantasyTeamName(LeagueInformationMapper.findTeamNameById(teamId, leagueInformation.getLeagueFranchises()));
        roster.setPlayerList(playerList);
        roster.setSalaryConsumed(calcSalaryConsumed(playerList));
        return roster;
    }

    public static double calcSalaryConsumed(List<bdl.models.Player> playerList) {
        return  playerList.stream().mapToDouble(player -> Double.parseDouble(player.getSalary())).count();
    }

}