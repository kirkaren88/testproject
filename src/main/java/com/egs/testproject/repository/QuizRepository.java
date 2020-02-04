package com.egs.testproject.repository;

import com.egs.testproject.model.persistence.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

    Quiz save(Quiz quiz);
}
