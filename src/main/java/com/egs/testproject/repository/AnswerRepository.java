package com.egs.testproject.repository;


import com.egs.testproject.model.persistence.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
