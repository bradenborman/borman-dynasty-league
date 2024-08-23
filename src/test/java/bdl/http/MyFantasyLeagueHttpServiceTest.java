package bdl.http;

import bdl.http.models.mfl.FreeAgents;
import bdl.http.models.mfl.MflRosterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MyFantasyLeagueHttpServiceTest {

    @Autowired
    MyFantasyLeagueHttpService myFantasyLeagueHttpService;

    @Test
    void fetchMFLLeagueInfo() {
        String response = myFantasyLeagueHttpService.fetchMFLLeagueInfo();
        assert response != null;
        System.out.println(response);
    }

    @Test
    void fetchRosters() {
        MflRosterResponse response = myFantasyLeagueHttpService.fetchRosters();
        assert response != null;
    }

    @Test
    void fetchFreeAgents() {
        FreeAgents response = myFantasyLeagueHttpService.fetchFreeAgents(Optional.empty());
        assert response != null;
    }

}