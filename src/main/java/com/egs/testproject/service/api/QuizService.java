package com.egs.testproject.service.api;

import com.egs.testproject.exception.QuizNotFoundException;
import com.egs.testproject.model.dto.QuizDto;
import com.egs.testproject.model.persistence.Question;
import com.egs.testproject.model.persistence.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface QuizService {

    void save(Quiz quiz);

    QuizDto findById(Integer id) throws QuizNotFoundException;

    Optional<Quiz> findQuizById(Integer id) throws QuizNotFoundException;

    List<QuizDto> findAll() throws QuizNotFoundException;

    List<Question> getQuestionsByCount(Integer quizId, Integer countOfQuestions) throws QuizNotFoundException;

    void deleteById(Integer id) throws QuizNotFoundException;

    void addQuestionByQuizId(Integer quizId, Question question);

    void saveAfterDeleteQuestion(Quiz quiz);

}
