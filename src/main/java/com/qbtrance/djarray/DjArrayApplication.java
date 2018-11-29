package com.qbtrance.djarray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DjArrayApplication {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = SpringApplication.run(DjArrayApplication.class, args);
        //for (String name : applicationContext.getBeanDefinitionNames()) {
        //    System.out.println(name);
        //}
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
