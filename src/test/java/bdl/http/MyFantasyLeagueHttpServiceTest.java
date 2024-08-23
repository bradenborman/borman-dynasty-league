package bdl.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyFantasyLeagueHttpServiceTest {

    @Autowired
    MyFantasyLeagueHttpService myFantasyLeagueHttpService;

//    @Test
//    void fetchMFLLeagueInfo() {
//        MflLeagueInformation response = myFantasyLeagueHttpService.fetchMFLLeagueInfo();
//        assert response != null;
//    }

//    @Test
//    void fetchRosters() {
//        MflRosterResponse response = myFantasyLeagueHttpService.fetchRosters();
//        assert response != null;
//    }
//
//    @Test
//    void fetchFreeAgents() {
//        FreeAgents response = myFantasyLeagueHttpService.fetchFreeAgents(Optional.empty());
//        assert response != null;
//    }

}