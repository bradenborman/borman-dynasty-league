package bdl.http.models.mfl;

import java.util.List;

public class LeagueUnit {

    private String unit;
    private List<Player> players;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}