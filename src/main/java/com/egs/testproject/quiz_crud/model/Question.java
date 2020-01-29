package com.egs.testproject.quiz_crud.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "QUESTIONS")
public class Question {
    @Id
    private long id;

    @Column(name = "question")
    private String name;

    @ManyToOne
    private Quiz quiz;

    @OneToMany
    private List<Answer> answers;

    //no-arg constructor
    public Question() {
        this.answers = new ArrayList<>();
    }

    //setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    //getters
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public List<Answer> getAnswers() {
        return this.answers;
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
