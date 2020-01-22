package com.egs.testproject.quiz_crud;

import java.util.Iterator;
import java.util.Set;

public class Question {
    private long id;
    private String name;
    private Set<Answer> answers;
    private byte point;
    private byte correctAnswer;

    //default constructor
    Question() {
    }

    Question(long id, String name, Set<Answer> answers, byte point, byte correctAnswer) {
        this.id = id;
        this.name = name;
        this.answers = answers;
        this.point = point;
        this.correctAnswer = correctAnswer;
    }

    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public void setPoint(byte point) {
        this.point = point;
    }

    public void setCorrectAnswer(byte correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    //getters
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Set<Answer> getAnswers() {
        return this.answers;
    }

    public byte getPoint() {
        return this.point;
    }

    public byte getCorrectAnswer() {
        return this.correctAnswer;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id).append(" ").append(this.name).append("\n").append("Answers:\n");

        Iterator<Answer> answerIterator = this.answers.iterator();

        while (answerIterator.hasNext()) {
            stringBuilder.append(answerIterator.next().toString());
        }
        return stringBuilder.toString();
    }
}
