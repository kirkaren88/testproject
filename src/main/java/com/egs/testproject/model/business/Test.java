package com.egs.testproject.model.business;

import com.egs.testproject.model.persistence.Answer;
import com.egs.testproject.model.persistence.Question;

import java.util.List;


public class Test {

    private Question question;

    private List<Answer> answers;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
