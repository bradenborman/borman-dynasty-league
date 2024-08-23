package bdl.http.models.mfl;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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