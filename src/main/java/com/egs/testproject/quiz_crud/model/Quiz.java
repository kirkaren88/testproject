package com.egs.testproject.quiz_crud.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "QUIZ_TABLE")
public class Quiz {

    @Id
    private Long id;

    @OneToMany
    private List<Question> questions;

    //no-arg constructor
    public Quiz() {
        this.questions = new ArrayList<>();
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    //getters
    public Long getId() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
