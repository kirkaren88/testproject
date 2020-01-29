package com.egs.testproject.quiz_crud.repository;

import com.egs.testproject.quiz_crud.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository
        extends JpaRepository<Quiz, Long> {
}
