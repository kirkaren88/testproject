package com.egs.testproject.quiz_crud;

public class Answer {
    private byte ans;
    private String name;
    private long questionId;

    //default constructor
    Answer() {
    }

    Answer(byte ans, String name, long questionId) {
        this.ans = ans;
        this.name = name;
        this.questionId = questionId;
    }

    //setters
    public void setAns(byte ans) {
        this.ans = ans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    //getters
    public long getAns() {
        return this.ans;
    }

    public String getName() {
        return this.name;
    }

    public long getQuestionId() {
        return this.questionId;
    }

    @Override
    public String toString() {
        return this.ans + " " + this.name + "\n";
    }
}