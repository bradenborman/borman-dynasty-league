package bdl.controllers;

import bdl.models.TeamRoster;
import bdl.services.RosterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roster")
public class RosterController {

    private final RosterService rosterService;

    public RosterController(RosterService rosterService) {
        this.rosterService = rosterService;
    }

    @GetMapping(value = "/team/{teamId}", produces = "application/json")
    public TeamRoster rosterByTeamId(@PathVariable String teamId, @RequestParam String leagueId) {
        return rosterService.buildRosterByTeam(teamId, leagueId);
    }

    @GetMapping(value = "/league", produces = "application/json")
    public List<TeamRoster> allRostersInLeague(@RequestParam String leagueId) {
        return rosterService.allRosters(leagueId);
    }

}