package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

class WeeklySchedule {

    @JacksonXmlProperty(isAttribute = true, localName = "week")
    private String week;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "matchup")
    private List<Matchup> matchups;

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public List<Matchup> getMatchups() {
        return matchups;
    }

    public void setMatchups(List<Matchup> matchups) {
        this.matchups = matchups;
    }

}