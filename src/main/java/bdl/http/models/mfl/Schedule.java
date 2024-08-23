package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JacksonXmlRootElement(localName = "schedule")
public class Schedule {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "weeklySchedule")
    private List<WeeklySchedule> weeklySchedule;

    public List<WeeklySchedule> getWeeklySchedule() {
        return weeklySchedule;
    }

    public void setWeeklySchedule(List<WeeklySchedule> weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
    }

}

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

class Matchup {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "franchise")
    private List<ScheduleFranchise> franchises;

    public List<ScheduleFranchise> getFranchises() {
        return franchises;
    }

    public void setFranchises(List<ScheduleFranchise> franchises) {
        this.franchises = franchises;
    }
}

class ScheduleFranchise {

    @JacksonXmlProperty(isAttribute = true, localName = "id")
    private String id;

    @JacksonXmlProperty(isAttribute = true, localName = "isHome")
    private String isHome;

    @JacksonXmlProperty(isAttribute = true, localName = "spread")
    private String spread;

    @JacksonXmlProperty(isAttribute = true, localName = "result")
    private String result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsHome() {
        return isHome;
    }

    public void setIsHome(String isHome) {
        this.isHome = isHome;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}