package com.egs.testproject.quiz_crud.service;

import com.egs.testproject.quiz_crud.model.Answer;
import com.egs.testproject.quiz_crud.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {

    @Autowired
    AnswerRepository repository;

    public Answer createAnswer(Answer newAnswer) {

        Optional<Answer> answerOptional = repository.findById(newAnswer.getId());

        if (! answerOptional.isPresent()) {
            repository.save(newAnswer);
        }
        return newAnswer;
    }

    public Answer updateAnswer(Answer newAnswer) {

        Optional<Answer> answerOptional = repository.findById(newAnswer.getId());

        if (answerOptional.isPresent()) {
            Answer answer = answerOptional.get();
            answer.setId(newAnswer.getId());
            answer.setName(newAnswer.getName());
            answer.setQuestion(newAnswer.getQuestion());

            return answer;
        }
        //TBD: throws exception
        return null;
    }

    public void removeAnswer(Answer answer) {

        Optional<Answer> answerOptional = repository.findById(answer.getId());

        if (answerOptional.isPresent()) {
            repository.delete(answerOptional.get());
        }
    }

    public Answer findAnswer(Answer answer) {
        Optional<Answer> answerOptional = repository.findById(answer.getId());
        return answerOptional.get();
    }
}
