package bdl.services;

import bdl.models.TeamRoster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RosterServiceTest {

    @Autowired
    RosterService rosterService;

    @Test
    void buildRosterByTeam() {
        TeamRoster roster = rosterService.buildRosterByTeam("0003", "32291");
        Assertions.assertNotNull(roster);
    }

    @Test
    void allTeamIds() {
        List<String> teamIds = rosterService.allTeamIds("32291");
        Assertions.assertNotNull(teamIds);
    }

}