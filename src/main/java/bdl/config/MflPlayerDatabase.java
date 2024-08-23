package bdl.config;

import bdl.http.models.mfl.MFLPlayerData;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MflPlayerDatabase {

    private static final Map<String, MFLPlayerData.PlayerData> playerDataMap = new HashMap<>();

    static {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        InputStream inputStream = MflPlayerDatabase.class.getClassLoader().getResourceAsStream("player-data/players.xml");
        if (inputStream == null) {
            throw new RuntimeException("Resource not found: player-data/players.xml");
        }

        try {
            MFLPlayerData mflPlayerData = xmlMapper.readValue(inputStream, MFLPlayerData.class);
            if (mflPlayerData != null && mflPlayerData.getPlayer() != null) {
                for (MFLPlayerData.PlayerData playerData : mflPlayerData.getPlayer()) {
                    playerDataMap.put(playerData.getId(), playerData);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static MFLPlayerData.PlayerData getPlayerById(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Player ID cannot be null");
        }
        return playerDataMap.getOrDefault(id, null);
    }

}
