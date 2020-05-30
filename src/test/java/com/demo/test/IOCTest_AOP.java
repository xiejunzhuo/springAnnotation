package com.demo.test;

import com.demo.aop.MathCalculator;
import com.demo.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 22:44
 */
public class IOCTest_AOP {

    @Test
    public void testAop() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(1, 0);

        applicationContext.close();
    }
}
