package com.egs.testproject.repository;


import com.egs.testproject.model.persistence.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {


}
