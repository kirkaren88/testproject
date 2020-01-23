package com.egs.testproject.controller;


import com.egs.testproject.model.business.Test;
import com.egs.testproject.service.api.AnswerService;
import com.egs.testproject.service.api.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

   @Autowired
   AnswerService answerService;



//    @GetMapping("/questions")
//    public ResponseEntity getAll() {
//
//        return ResponseEntity.ok(questionRepository.findAll());
//    }
//
//    @GetMapping("/questions/{id}")
//    public ResponseEntity getTestById(@PathVariable("id") Integer id){
//        return ResponseEntity.ok(questionRepository.findById(id));
//    }

    @Transactional
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/question")
    public void questionAdd(@RequestBody Test test){
       questionService.saveWithAnswer(test.getQuestion(),test.getAnswers());
    }


}