package bdl.models;

public class LeagueInformation {

    private String leagueName;
    private int maxRosterSize;
    private int injuredReserveCount;

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getMaxRosterSize() {
        return maxRosterSize;
    }

    public void setMaxRosterSize(int maxRosterSize) {
        this.maxRosterSize = maxRosterSize;
    }

    public int getInjuredReserveCount() {
        return injuredReserveCount;
    }

    public void setInjuredReserveCount(int injuredReserveCount) {
        this.injuredReserveCount = injuredReserveCount;
    }
}