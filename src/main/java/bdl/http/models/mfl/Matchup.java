package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

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