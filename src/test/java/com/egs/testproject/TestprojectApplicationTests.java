package com.egs.testproject;

import com.egs.testproject.quiz_crud.model.Question;
import com.egs.testproject.quiz_crud.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestprojectApplicationTests {

    @Test
    void contextLoads() {
        QuestionService questionService = new QuestionService();

        Question question1 = new Question();
        question1.setId(1);
        question1.setName("What is your name?");
        questionService.createQuestion(question1);
    }

}
