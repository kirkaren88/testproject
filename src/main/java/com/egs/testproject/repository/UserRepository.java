package com.egs.testproject.repository;


import com.egs.testproject.model.dto.LeaderBoardDto;
import com.egs.testproject.model.persistence.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


     User findByEmail(String email);

    List<User> findAllBy(Sort sort);
}
