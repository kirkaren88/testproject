package com.egs.testproject.service.api;

import com.egs.testproject.model.persistence.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AnswerService {

    void saveAll(List<Answer> answers) ;

    void deleteById(Integer id);

   // List<Answer> findAllByQuestionId(int questionId);

}
