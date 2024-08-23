package bdl.mappers;

import bdl.http.models.mfl.LeagueFranchise;

import java.util.List;

public class LeagueInformationMapper {

    public static String findTeamNameById(String teamId, List<LeagueFranchise> franchiseList) {
        return franchiseList.stream().filter(x -> x.getId().equals(teamId)).findFirst().orElseThrow(RuntimeException::new).getName();
    }

}