package com.hainet.mybatis.spring.sample;

import com.hainet.mybatis.spring.sample.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MybatisSpringSampleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = (PersonService) applicationContext.getBean("personService");

        System.out.println(personService.findAll());
    }
}