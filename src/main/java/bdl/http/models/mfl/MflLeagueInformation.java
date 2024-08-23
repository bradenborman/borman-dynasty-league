package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class MflLeagueInformation {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private int rosterSize;

    @JacksonXmlProperty(isAttribute = true)
    private int injuredReserve;

    @JacksonXmlProperty(isAttribute = true)
    private int salaryCapAmount;

    @JacksonXmlElementWrapper(useWrapping = true, localName = "starters ")
    private List<Position> starters;

    @JacksonXmlElementWrapper(useWrapping = true, localName = "rosterLimits ")
    private List<Position> rosterLimits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRosterSize() {
        return rosterSize;
    }

    public void setRosterSize(int rosterSize) {
        this.rosterSize = rosterSize;
    }

    public int getInjuredReserve() {
        return injuredReserve;
    }

    public void setInjuredReserve(int injuredReserve) {
        this.injuredReserve = injuredReserve;
    }

    public int getSalaryCapAmount() {
        return salaryCapAmount;
    }

    public void setSalaryCapAmount(int salaryCapAmount) {
        this.salaryCapAmount = salaryCapAmount;
    }

    public List<Position> getStarters() {
        return starters;
    }

    public void setStarters(List<Position> starters) {
        this.starters = starters;
    }

    public List<Position> getRosterLimits() {
        return rosterLimits;
    }

    public void setRosterLimits(List<Position> rosterLimits) {
        this.rosterLimits = rosterLimits;
    }
}

class Position {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private int limit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}