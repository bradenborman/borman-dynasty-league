package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class MflLeagueInformation {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String rosterSize;

    @JacksonXmlProperty(isAttribute = true)
    private String injuredReserve;

    @JacksonXmlProperty(isAttribute = true)
    private String salaryCapAmount;

    @JacksonXmlElementWrapper(localName = "starters")
    @JacksonXmlProperty
    private List<Position> validLineupRequirements;

    @JacksonXmlElementWrapper(localName = "rosterLimits")
    @JacksonXmlProperty
    private List<Position> rosterLimits;

    @JacksonXmlElementWrapper(localName = "conferences")
    @JacksonXmlProperty
    private List<Conference> conferences;

    @JacksonXmlElementWrapper(localName = "divisions")
    @JacksonXmlProperty
    private List<Division> divisions;

    @JacksonXmlElementWrapper(localName = "franchises")
    @JacksonXmlProperty
    private List<LeagueFranchise> leagueFranchises;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRosterSize() {
        return rosterSize;
    }

    public void setRosterSize(String rosterSize) {
        this.rosterSize = rosterSize;
    }

    public String getInjuredReserve() {
        return injuredReserve;
    }

    public void setInjuredReserve(String injuredReserve) {
        this.injuredReserve = injuredReserve;
    }

    public String getSalaryCapAmount() {
        return salaryCapAmount;
    }

    public void setSalaryCapAmount(String salaryCapAmount) {
        this.salaryCapAmount = salaryCapAmount;
    }

    public List<Position> getValidLineupRequirements() {
        return validLineupRequirements;
    }

    public void setValidLineupRequirements(List<Position> validLineupRequirements) {
        this.validLineupRequirements = validLineupRequirements;
    }

    public List<Position> getRosterLimits() {
        return rosterLimits;
    }

    public void setRosterLimits(List<Position> rosterLimits) {
        this.rosterLimits = rosterLimits;
    }

    public List<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    public List<LeagueFranchise> getLeagueFranchises() {
        return leagueFranchises;
    }

    public void setLeagueFranchises(List<LeagueFranchise> leagueFranchises) {
        this.leagueFranchises = leagueFranchises;
    }
}
