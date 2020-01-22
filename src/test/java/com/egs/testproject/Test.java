package com.egs.testproject;

import com.egs.testproject.quiz_crud.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Question first = (Question) context.getBean("question1");
        System.out.println(first);
        System.out.println("Correct answer: " + first.getCorrectAnswer()+ "\n");

        Question second = (Question) context.getBean("question2");
        System.out.println(second);
        System.out.println("Correct answer: " + second.getCorrectAnswer());
    }
}
