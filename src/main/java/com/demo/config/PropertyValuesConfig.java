package com.demo.config;

import com.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 21:12
 */
@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class PropertyValuesConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
