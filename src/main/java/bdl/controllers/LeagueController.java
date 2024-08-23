package bdl.controllers;

import bdl.models.LeagueInformation;
import bdl.services.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/league")
public class LeagueController {

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping(value = "/{leagueId}", produces = "application/json")
    public LeagueInformation rosterByTeamId(@PathVariable String leagueId) {
        return leagueService.leagueData(leagueId);
    }


}