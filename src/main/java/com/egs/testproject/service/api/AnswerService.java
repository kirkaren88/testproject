package com.egs.testproject.service.api;

import com.egs.testproject.model.persistence.Answer;

import java.util.List;

public interface AnswerService {

    void saveAllAnswers(List<Answer> answers) ;

}
