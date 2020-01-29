package com.egs.testproject.quiz_crud.repository;

import com.egs.testproject.quiz_crud.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository
        extends JpaRepository<Answer, Long> {
}
