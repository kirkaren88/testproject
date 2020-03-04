package com.egs.testproject.repository;


import com.egs.testproject.model.persistence.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {
    Optional<Question> findByQuestion(String question);
}
