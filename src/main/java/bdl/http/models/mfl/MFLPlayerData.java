package bdl.http.models.mfl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class MFLPlayerData {

    @JacksonXmlProperty(isAttribute = true)
    private String timestamp;

    @JacksonXmlElementWrapper(namespace = "players", useWrapping = false)
    @JacksonXmlProperty
    private List<PlayerData> player;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<PlayerData> getPlayer() {
        return player;
    }

    public void setPlayer(List<PlayerData> player) {
        this.player = player;
    }

    public static class PlayerData {

        @JacksonXmlProperty(isAttribute = true)
        private String id;

        @JacksonXmlProperty(isAttribute = true)
        private String name;

        @JacksonXmlProperty(isAttribute = true)
        private String position;

        @JacksonXmlProperty(isAttribute = true, localName = "team")
        private String teamAbbreviation;

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

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getTeamAbbreviation() {
            return teamAbbreviation;
        }

        public void setTeamAbbreviation(String teamAbbreviation) {
            this.teamAbbreviation = teamAbbreviation;
        }
    }


}