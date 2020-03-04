package com.egs.testproject.service.impl;

import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.repository.AnswerRepository;
import com.egs.testproject.service.api.AnswerService;
import com.egs.testproject.service.api.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionService questionService;

    @Override
    @Transactional
    public void saveAll(List<Answer> answers) {
        answerRepository.saveAll(answers);
    }

    @Override
    @Transactional
    public void deleteById(Integer id){
        answerRepository.deleteById(id);
    }

//    @Override
//    @Transactional
//    public List<Answer> findAllByQuestionId(int questionId) {
//        return answerRepository.findAllByQuestionId(questionId);
//    }
}
