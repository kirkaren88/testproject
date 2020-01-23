package com.egs.testproject.service.impl;


import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.model.persistence.Question;
import com.egs.testproject.repository.AnswerRepository;
import com.egs.testproject.repository.QuestionRepository;
import com.egs.testproject.service.api.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Override
    @Transactional
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    @Transactional
    public void saveWithAnswer(Question question, List<Answer> answers) {
        Question questionWithId = saveQuestion(question);
        answers.forEach(item -> item.setQuestion(questionWithId));
        answerRepository.saveAll(answers);
    }
}
