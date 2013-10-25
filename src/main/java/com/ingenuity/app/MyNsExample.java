package com.ingenuity.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.util.ReflectionTestUtils;

import java.text.SimpleDateFormat;

public class MyNsExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myns.xml");
        JobDetailTemplate jobDetailTemplate = context.getBean(JobDetailTemplate.class);

        SimpleDateFormat dateFormat = jobDetailTemplate.getDateFormat();
        String pattern = (String) ReflectionTestUtils.getField(dateFormat, "pattern");
        System.out.println(pattern);
    }
}
