package bdl.http;

import bdl.http.models.mfl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MyFantasyLeagueHttpServiceTest {

    @Autowired
    MyFantasyLeagueHttpService myFantasyLeagueHttpService;

    @Test
    void fetchSalaryInformation() {
        LoginResponse response = myFantasyLeagueHttpService.attemptLogin("bradenborman@hotmail.com", "Borm0000$$");
        assert response != null;
    }

//    @Test
//    void fetchSharkPlayerRanks() {
//        SharkPlayerRankings response = myFantasyLeagueHttpService.fetchSharkPlayerRanks(Optional.empty());
//        assert response != null;
//    }
//
//    @Test
//    void fetchSalaryInformation() {
//        SalaryInformation response = myFantasyLeagueHttpService.fetchSalaryInformation();
//        assert response != null;
//    }
//
//    @Test
//    void fetchMFLSchedule() {
//        String response = myFantasyLeagueHttpService.fetchMFLSchedule(Optional.empty(), Optional.empty());
//        assert response != null;
//    }
//
//    @Test
//    void fetchMFLLeagueInfo() {
//        MflLeagueInformation response = myFantasyLeagueHttpService.fetchMFLLeagueInfo();
//        assert response != null;
//    }
//
//    @Test
//    void fetchRosters() {
//        MflRosterResponse response = myFantasyLeagueHttpService.fetchRosters(Optional.empty());
//        assert response != null;
//    }
//
//    @Test
//    void fetchFreeAgents() {
//        FreeAgents response = myFantasyLeagueHttpService.fetchFreeAgents(Optional.empty());
//        assert response != null;
//    }

}