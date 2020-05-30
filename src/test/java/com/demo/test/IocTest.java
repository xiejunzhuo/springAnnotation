package com.demo.test;

import com.demo.bean.Person;
import com.demo.config.MainConfig;
import com.demo.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 16:41
 */
public class IocTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void test01(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
       System.out.println("容器创建完成");
        Person person1 = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");
        System.out.println(person1==person2);
    }

    @Test
    public void test3(){
        System.out.println("容器创建完成");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //获取环境变量的额值
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        for (String name :beanDefinitionNames){
           System.out.println(name);
       }
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);

       System.out.println(beansOfType);

    }

    @Test
    public void testImport(){
        System.out.println("容器创建完成");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name :beanDefinitionNames){
            System.out.println(name);
        }
    }

}
