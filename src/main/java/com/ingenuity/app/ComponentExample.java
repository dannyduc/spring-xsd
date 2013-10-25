package com.ingenuity.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
        Component component = context.getBean(Component.class);
        System.out.println(component);
    }
}
