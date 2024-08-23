package bdl.mappers;

import bdl.http.models.mfl.LeagueFranchise;
import bdl.http.models.mfl.MflLeagueInformation;
import bdl.models.LeagueInformation;

import java.util.List;

public class LeagueInformationMapper {

    public static String findTeamNameById(String teamId, List<LeagueFranchise> franchiseList) {
        return franchiseList.stream().filter(x -> x.getId().equals(teamId)).findFirst().orElseThrow(RuntimeException::new).getName();
    }

    public static String findTeamOwnersName(String teamId, List<LeagueFranchise> franchiseList) {
        return franchiseList.stream().filter(x -> x.getId().equals(teamId)).findFirst().orElseThrow(RuntimeException::new).getOwnerName();
    }


    public static LeagueInformation mapMflToBdl(MflLeagueInformation mflLeagueInformation) {
        LeagueInformation leagueInformation = new LeagueInformation();
        leagueInformation.setLeagueName(mflLeagueInformation.getName());
        leagueInformation.setMaxRosterSize(Integer.parseInt(mflLeagueInformation.getRosterSize()));
        leagueInformation.setInjuredReserveCount(Integer.parseInt(mflLeagueInformation.getInjuredReserve()));
        return leagueInformation;
    }

}