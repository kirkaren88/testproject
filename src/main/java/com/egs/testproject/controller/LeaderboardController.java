package com.egs.testproject.controller;

import com.egs.testproject.model.Leaderboard;
import com.egs.testproject.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LeaderboardController {

    private LeaderboardRepository leaderboardRepository;

    @Autowired
    public LeaderboardController(LeaderboardRepository userRepository) {
        this.leaderboardRepository = userRepository;
    }

    @GetMapping("/users")
    List<Leaderboard> findAll() {
        return leaderboardRepository.findAll();
    }

    @GetMapping("/sortedUsers")
    List<Leaderboard> sortedUsers() {
        return leaderboardRepository.findAllByOrderByUsersCountDesc();
    }

}
