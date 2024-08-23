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

class Position {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String limit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

}

class Conference {

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Division {

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String conference;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

}

class Franchises {

    @JacksonXmlProperty(localName = "franchise")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<LeagueFranchise> franchiseList;

    @JacksonXmlProperty(isAttribute = true)
    private String count;

    public List<LeagueFranchise> getFranchiseList() {
        return franchiseList;
    }

    public void setFranchiseList(List<LeagueFranchise> franchiseList) {
        this.franchiseList = franchiseList;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}

class LeagueFranchise {

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String logo;

    @JacksonXmlProperty(isAttribute = true)
    private String icon;

    @JacksonXmlProperty(isAttribute = true)
    private String salaryCapAmount;

    @JacksonXmlProperty(isAttribute = true)
    private String waiverSortOrder;

    @JacksonXmlProperty(isAttribute = true)
    private String bbidAvailableBalance;

    @JacksonXmlProperty(isAttribute = true)
    private String division;

    @JacksonXmlProperty(isAttribute = true)
    private String abbrev;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSalaryCapAmount() {
        return salaryCapAmount;
    }

    public void setSalaryCapAmount(String salaryCapAmount) {
        this.salaryCapAmount = salaryCapAmount;
    }

    public String getWaiverSortOrder() {
        return waiverSortOrder;
    }

    public void setWaiverSortOrder(String waiverSortOrder) {
        this.waiverSortOrder = waiverSortOrder;
    }

    public String getBbidAvailableBalance() {
        return bbidAvailableBalance;
    }

    public void setBbidAvailableBalance(String bbidAvailableBalance) {
        this.bbidAvailableBalance = bbidAvailableBalance;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

}