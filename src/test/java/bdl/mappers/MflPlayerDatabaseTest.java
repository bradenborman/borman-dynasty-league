package bdl.mappers;

import bdl.config.MflPlayerDatabase;
import bdl.http.models.mfl.MFLPlayerData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MflPlayerDatabaseTest {

    @Test
    void name() {
        MFLPlayerData.PlayerData playerData = MflPlayerDatabase.getPlayerById("10700");
        Assertions.assertNotNull(playerData);
    }

}