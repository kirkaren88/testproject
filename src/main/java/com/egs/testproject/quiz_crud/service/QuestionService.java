package com.egs.testproject.quiz_crud.service;

import com.egs.testproject.quiz_crud.model.Question;
import com.egs.testproject.quiz_crud.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;

    public Question createQuestion(Question newQuestion) {

        Optional<Question> questionOptional = repository.findById(newQuestion.getId());

        if (! questionOptional.isPresent()) {
            repository.save(newQuestion);
        }
        return newQuestion;
    }

    public Question updateQuestion(Question newQuestion) {

        Optional<Question> questionOptional = repository.findById(newQuestion.getId());

        if (questionOptional.isPresent()) {
            Question question = questionOptional.get();
            question.setId(newQuestion.getId());
            question.setName(newQuestion.getName());
            question.setAnswers(newQuestion.getAnswers());
            question.setQuiz(newQuestion.getQuiz());

            return question;
        }
        //TBD: throws exception
        return null;
    }

    public void removeQuestion(Question question) {

        Optional<Question> questionOptional = repository.findById(question.getId());

        if (questionOptional.isPresent()) {
            repository.delete(questionOptional.get());
        }
    }

    public Question findQuestion(Question question) {
        Optional<Question> questionOptional = repository.findById(question.getId());
        return questionOptional.get();
    }
}