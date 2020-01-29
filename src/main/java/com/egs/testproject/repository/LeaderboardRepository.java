package com.egs.testproject.repository;

import com.egs.testproject.model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {

      List<Leaderboard> findAllByOrderByUsersCountDesc();

}
