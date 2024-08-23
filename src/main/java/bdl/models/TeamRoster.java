package bdl.models;

import java.util.List;

public class TeamRoster {

    private String teamId;
    private String fantasyTeamName;
    private List<Player> playerList;
    private double salaryConsumed;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
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

    public double getSalaryConsumed() {
        return salaryConsumed;
    }

    public void setSalaryConsumed(double salaryConsumed) {
        this.salaryConsumed = salaryConsumed;
    }

}