package com.egs.testproject.repository;

import com.egs.testproject.model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard,Long> {

    // alternative variation with query
    //  @Query(value = "SELECT s FROM Leaderboard s ORDER BY s.usersCount DESC ")
    // List<Leaderboard> findByCount();

    List<Leaderboard> findAllByOrderByUsersCountDesc();
}