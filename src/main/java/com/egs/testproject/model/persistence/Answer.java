package com.egs.testproject.model.persistence;


import javax.persistence.*;

@Table
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String answer;

    @Column
    private Boolean isAnswerCorrect;

    @ManyToOne
    private Question question;

    public Answer(String answer, Boolean isAnswerCorrect, Question question){
        this.answer = answer;
        this.isAnswerCorrect = isAnswerCorrect;
        this.question = question;
    }

    public Answer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getIsAnswerCorrect() {
        return isAnswerCorrect;
    }

    public void setIsAnswerCorrect(Boolean answerCorrect) {
        isAnswerCorrect = answerCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
