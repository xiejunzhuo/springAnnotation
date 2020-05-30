package com.demo.config;

import com.demo.bean.Person;
import com.demo.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 16:16
 */
//spring注解配置，告诉spring这是一个配置类 相当于xml
@Configuration
@ComponentScan(value = "com.demo"
        , excludeFilters={
//        @ComponentScan.Filter(type =FilterType.ANNOTATION ,classes = {Controller.class})
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE ,classes = BookService.class)
}
,includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeyFilter.class) //自定义的过滤规则
}
,useDefaultFilters = false)
//ComponentScan.Filter[] includeFilters() default {}; 包含哪些规则的扫描
//    ComponentScan.Filter[] excludeFilters() default {}; 排除掉哪些规则的扫描
//type =FilterType.ANNOTATION 注解方式【注解方式 类方式 正则表达式等】
public class MainConfig {

    //@Bean给容器注册一个Bean；类型为返回值的类型，id默认是方法名
    @Bean
    public Person person(){
        return  new Person("zhangshan",12);
    }

}
