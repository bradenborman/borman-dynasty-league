package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "salaries")
public class SalaryInformation {

    private SalaryLeagueUnit leagueUnit;

    public SalaryLeagueUnit getLeagueUnit() {
        return leagueUnit;
    }

    public void setLeagueUnit(SalaryLeagueUnit leagueUnit) {
        this.leagueUnit = leagueUnit;
    }

}

class SalaryLeagueUnit {

    @JacksonXmlProperty(isAttribute = true)
    private String unit;

    @JacksonXmlElementWrapper(localName = "player", useWrapping = false)
    @JacksonXmlProperty
    private List<SalaryPlayer> player;

    // Getters and setters
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<SalaryPlayer> getPlayer() {
        return player;
    }

    public void setPlayer(List<SalaryPlayer> player) {
        this.player = player;
    }
}

class SalaryPlayer {

    @JacksonXmlProperty(isAttribute = true)
    private String salary;

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    // Getters and setters
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}