package com.egs.testproject.service.api;

import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.model.persistence.Question;

import java.util.List;

public interface QuestionService {
     Question saveQuestion(Question question);
     void saveWithAnswer(Question question, List<Answer> answers);
}
