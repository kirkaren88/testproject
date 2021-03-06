package com.egs.testproject.controller;

import com.egs.testproject.exception.QuizNotFoundException;
import com.egs.testproject.exception.UserNotFoundException;
import com.egs.testproject.model.dto.JwtAuthenticationRequestWithQuestion;
import com.egs.testproject.model.dto.QuestionDto;
import com.egs.testproject.model.persistence.Question;
import com.egs.testproject.model.persistence.User;
import com.egs.testproject.service.api.AnswerService;
import com.egs.testproject.service.api.QuestionService;
import com.egs.testproject.service.api.QuizService;
import com.egs.testproject.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionEndPoint {

    @Autowired
    QuizService quizService;

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @Autowired
    UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/add/{quiz_id}")
    public void questionAdd(@PathVariable("quiz_id") Integer quizId, @RequestBody Question question) throws QuizNotFoundException {
        quizService.addQuestionByQuizId(quizId, question);

    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/{id}")
    public void updateQuestionById(@PathVariable("id") Integer id, @RequestBody Question newQuestion) {
        questionService.updateById(id, newQuestion);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete")
    public void deleteQuestionById(@RequestParam("quiz_id") Integer quizId, @RequestParam("question_id") Integer questionId) throws QuizNotFoundException {
        questionService.deleteByQuizId(quizId, questionId);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public QuestionDto findById(@PathVariable("id") Integer id) {
        return questionService.findById(id);
    }

    @GetMapping("/questions")
    public List<QuestionDto> findAll() {
        return questionService.findAll();
    }

    @PutMapping("/checkAnswer")
    @ResponseStatus(HttpStatus.OK)
    public boolean checkIsAnswerCorrect(@RequestBody JwtAuthenticationRequestWithQuestion jwtAuthenticationRequestWithQuestion) throws UserNotFoundException {
        Question question = questionService.findByQuestion(jwtAuthenticationRequestWithQuestion.getQuestion().getQuestion()).get();
        if (jwtAuthenticationRequestWithQuestion.getQuestion().getCorrect().equals(question.getCorrect())) {
            if (jwtAuthenticationRequestWithQuestion.getJwt() != null) {
                if (jwtAuthenticationRequestWithQuestion.getJwt().getEmail() != null) {
                    User user = userService.findByEmail(jwtAuthenticationRequestWithQuestion.getJwt().getEmail());
                    int userPoints = user.getPoints();
                    userPoints += question.getPoint();
                    userService.updatePoints(jwtAuthenticationRequestWithQuestion.getJwt().getEmail(), userPoints);
                }
            }
            return true;
        } else {
            return false;
        }
    }

}