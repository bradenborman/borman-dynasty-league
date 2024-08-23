package bdl.mappers;

import bdl.config.MflPlayerDatabase;
import bdl.http.models.mfl.MFLPlayerData;
import bdl.http.models.mfl.SalaryInformation;
import bdl.models.Player;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerMapper {

    public static List<Player> mapMflDataToBdl(List<bdl.http.models.mfl.Player> playerlist, SalaryInformation salaryInformation) {
       return playerlist.stream().map(x -> mapToPlayer(x, salaryInformation)).collect(Collectors.toList());
    }

    private static Player mapToPlayer(bdl.http.models.mfl.Player x, SalaryInformation salaryInformation) {
        MFLPlayerData.PlayerData playerData = MflPlayerDatabase.getPlayerById(x.getId());

        String salary = salaryInformation.getLeagueUnit()
                .getPlayer()
                .stream()
                .filter(salaryPlayer -> salaryPlayer.getId().equals(x.getId()))
                .findFirst()
                .orElseThrow(RuntimeException::new).getSalary();

        Player player = new Player();
        player.setPlayerId(playerData.getId());
        player.setFullName(playerData.getName());
        player.setPosition(playerData.getPosition());
        player.setTeamName(playerData.getTeamAbbreviation());
        player.setStatus(x.getStatus());
        player.setSalary(salary);

        return player;
    }


}