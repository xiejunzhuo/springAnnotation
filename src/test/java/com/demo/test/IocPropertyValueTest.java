package com.demo.test;

import com.demo.bean.Person;
import com.demo.config.PropertyValuesConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 21:18
 */
public class IocPropertyValueTest {

    @Test
    public void property() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyValuesConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
        System.out.println("====================");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);


    }
}
