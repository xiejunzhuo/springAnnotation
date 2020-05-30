package com.demo;

import com.demo.bean.Person;
import com.demo.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 16:19
 */
public class Main {
    public static void main(String[] args) {



        //相当于ClassPathXmlApplicationContext("spring.xml")
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person)applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for ( String name :beanNamesForType){
            //输出：person
            System.out.println(name);

        }
    }
}
