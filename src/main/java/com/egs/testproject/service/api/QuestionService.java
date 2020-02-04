package com.egs.testproject.service.api;


import com.egs.testproject.exception.QuizNotFoundException;
import com.egs.testproject.model.dto.QuestionDto;
import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.model.persistence.Question;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    Question saveQuestion(Question question);

    List<QuestionDto> findAll();

    QuestionDto findById(Integer id);

    Optional<Question> findQuestionById(Integer id);

    Page<Question> findByPage(Integer page, Integer size);

    Optional<Question> findByQuestion(String question);

   // public void saveWithAnswer(Question question, List<Answer> answers);

    void updateById(Integer id, Question question);

    void deleteById(Integer id);

    void deleteByQuizId(Integer quizId, Integer questionId) throws QuizNotFoundException;

}
