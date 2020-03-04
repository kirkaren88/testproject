package com.egs.testproject.exception;

public class QuizNotFoundException extends Exception {
    public QuizNotFoundException() {
        super();
    }

    public QuizNotFoundException(String message) {
        super(message);
    }
}
