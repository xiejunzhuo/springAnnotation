package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 22:09
 */
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @PostConstruct
    public void init(){
        System.out.println("------init @PostConstruct-------");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("------destory @PreDestroy-------");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
