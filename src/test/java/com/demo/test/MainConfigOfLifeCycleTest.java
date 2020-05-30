package com.demo.test;

import com.demo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 21:58
 */
public class MainConfigOfLifeCycleTest {

   @Test
    public void testLifeCycle(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");

        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }
}
