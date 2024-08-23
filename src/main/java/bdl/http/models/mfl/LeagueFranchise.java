package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LeagueFranchise {

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