package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "player_ranks")
public class SharkPlayerRankings {

    @JacksonXmlProperty(localName = "player")
    private List<RankingPlayer> players;

    @JacksonXmlElementWrapper(localName = "player", useWrapping = false)
    @JacksonXmlProperty
    public List<RankingPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<RankingPlayer> players) {
        this.players = players;
    }
}

class RankingPlayer {

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlProperty(isAttribute = true)
    private String change;

    @JacksonXmlProperty(isAttribute = true, localName = "last_week")
    private String lastWeeksRankings;

    @JacksonXmlProperty(isAttribute = true, localName = "rank")
    private String currentRank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getLastWeeksRankings() {
        return lastWeeksRankings;
    }

    public void setLastWeeksRankings(String lastWeeksRankings) {
        this.lastWeeksRankings = lastWeeksRankings;
    }

    public String getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(String currentRank) {
        this.currentRank = currentRank;
    }

}