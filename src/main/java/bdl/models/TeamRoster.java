package bdl.models;

import java.util.List;
import java.util.Map;

public class TeamRoster {

    private String teamId;
    private String teamOwnersName;
    private String fantasyTeamName;
    private List<Player> playerList;
    private Map<String, List<Player>> dividedPlayerList;
    private double salaryConsumed;
    private double capRoom;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamOwnersName() {
        return teamOwnersName;
    }

    public void setTeamOwnersName(String teamOwnersName) {
        this.teamOwnersName = teamOwnersName;
    }

    public String getFantasyTeamName() {
        return fantasyTeamName;
    }

    public void setFantasyTeamName(String fantasyTeamName) {
        this.fantasyTeamName = fantasyTeamName;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Map<String, List<Player>> getDividedPlayerList() {
        return dividedPlayerList;
    }

    public void setDividedPlayerList(Map<String, List<Player>> dividedPlayerList) {
        this.dividedPlayerList = dividedPlayerList;
    }

    public double getSalaryConsumed() {
        return salaryConsumed;
    }

    public void setSalaryConsumed(double salaryConsumed) {
        this.salaryConsumed = salaryConsumed;
    }

    public double getCapRoom() {
        return capRoom;
    }

    public void setCapRoom(double capRoom) {
        this.capRoom = capRoom;
    }
}