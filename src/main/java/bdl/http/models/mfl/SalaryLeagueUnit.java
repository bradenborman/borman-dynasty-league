package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class SalaryLeagueUnit {

    @JacksonXmlProperty(isAttribute = true)
    private String unit;

    @JacksonXmlElementWrapper(localName = "player", useWrapping = false)
    @JacksonXmlProperty
    private List<SalaryPlayer> player;

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