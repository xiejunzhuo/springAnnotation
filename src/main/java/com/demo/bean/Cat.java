package com.demo.bean;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 18:01
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    /**
     * 初始化bean 相当于init方法
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...afterPropertiesSet...");
    }

    /**
     * 销毁
     * @throws Exception
     */
    public void destroy() throws Exception {
        System.out.println("cat...destroy...");
    }
}
