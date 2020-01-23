package com.egs.testproject.service.impl;

import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.repository.AnswerRepository;
import com.egs.testproject.service.api.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;
    @Override
    public void saveAllAnswers(List<Answer> answers) {
        answerRepository.saveAll(answers);
    }
}
