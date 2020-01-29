package com.egs.testproject.quiz_crud.repository;

import com.egs.testproject.quiz_crud.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository
        extends JpaRepository<Question, Long> {
}
