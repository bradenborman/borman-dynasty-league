package bdl.mappers;

import bdl.http.models.mfl.MflLeagueInformation;
import bdl.http.models.mfl.Player;
import bdl.http.models.mfl.SalaryInformation;
import bdl.models.TeamRoster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MflToBdlRosterMapper {

    public static TeamRoster mapMflDataToTeamRoster(String teamId, List<Player> playerlist, SalaryInformation salaryInformation, MflLeagueInformation leagueInformation) {
        TeamRoster roster = new TeamRoster();

        List<bdl.models.Player> playerList = PlayerMapper.mapMflDataToBdl(playerlist, salaryInformation);

        roster.setTeamId(teamId);
        roster.setTeamOwnersName(LeagueInformationMapper.findTeamOwnersName(teamId, leagueInformation.getLeagueFranchises()));
        roster.setFantasyTeamName(LeagueInformationMapper.findTeamNameById(teamId, leagueInformation.getLeagueFranchises()));
        roster.setPlayerList(playerList);
        roster.setDividedPlayerList(partitionPlayersByPostion(playerList));

        double salaryConsumed = calcSalaryConsumed(playerList);
        roster.setSalaryConsumed(salaryConsumed);
        roster.setCapRoom(Double.parseDouble(leagueInformation.getSalaryCapAmount()) - salaryConsumed);
        return roster;
    }

    private static Map<String, List<bdl.models.Player>> partitionPlayersByPostion(List<bdl.models.Player> playerList) {
        TreeMap<String, List<bdl.models.Player>> map = new TreeMap<>();
        map.put("QB", findPlayerThatMatch("QB", playerList));
        map.put("RB", findPlayerThatMatch("RB", playerList));
        map.put("WR", findPlayerThatMatch("WR", playerList));
        map.put("TE", findPlayerThatMatch("TE", playerList));
        map.put("PK", findPlayerThatMatch("PK", playerList));
        map.put("Def", findPlayerThatMatch("Def", playerList));
        return map;
    }

    private static List<bdl.models.Player> findPlayerThatMatch(String target, List<bdl.models.Player> playerList) {
        return playerList.stream().filter(x -> x.getPosition().equalsIgnoreCase(target)).toList();
    }

    public static double calcSalaryConsumed(List<bdl.models.Player> playerList) {
        return playerList.stream()
                .mapToDouble(player -> Double.parseDouble(player.getSalary()))
                .sum();
    }

}