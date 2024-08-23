package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

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