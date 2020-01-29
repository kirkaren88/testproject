package com.egs.testproject.controller;

import com.egs.testproject.model.Leaderboard;
import com.egs.testproject.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaderboardController {

    private LeaderboardRepository leaderboardRepository;

    @Autowired
    public LeaderboardController(LeaderboardRepository userRepository) {
        this.leaderboardRepository = userRepository;
    }

    @GetMapping("/sortedUsers")
    List<Leaderboard> sortedUsers() {
        return leaderboardRepository.findAllByOrderByUsersCountDesc();
    }

    @RequestMapping(
            value = "/addUsers",
            produces = "application/json",
            method = {RequestMethod.POST})
    public void addUsers(@RequestBody Leaderboard leaderboard) throws Exception {
        leaderboardRepository.save(leaderboard);
    }
}
