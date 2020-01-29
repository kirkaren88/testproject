package com.egs.testproject.quiz_crud.model;

import javax.persistence.*;


@Entity
@Table(name = "ANSWERS")
public class Answer {
    @Id
    private Long id;

    @Column(name = "answer")
    private String name;

    @ManyToOne
    Question question;

    //no-arg constructor
    Answer() {
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    //getters
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Question getQuestion() {
        return this.question;
    }

    @Override
    public String toString() {
        return "[" + this.id + " " + this.name + "]";
    }
}