package com.demo.config;

import com.demo.bean.Cat;
import com.demo.bean.Person;
import com.demo.condition.LinuxCondition;
import com.demo.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 23:32
 */
@Import({MyImportSelector.class, Cat.class,MyImportBeanDefinitionRegister.class})
@Configuration
public class MainConfig2 {
    //默认是单实例的

    /**
     *ConfigurableBeanFactory#SCOPE_SINGLETON  singleton 单实例 ioc容器启动时会
     * 调用方法对象创建放到IOC容器中，以后每次获取就是直接从容器中拿 map.get()
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE prototype  多实例 IOC容器启动并不会去调用对象方法创建对象，
     * 每次获取实例的时候创建，每次都会创建新的实例
     * WebApplicationContext#SCOPE_REQUEST request 同一个请求创建一个实例
     * WebApplicationContext#SCOPE_SESSION sessin 同一个session创建一个实例
     * @return
     *
     * 懒加载：
     *  单实例bean对象 默认在容器启动的时候创建对象
     *  懒加载：容器启动的时候不会创建对象，第一次使用的时候创建对象，并初始化
     */
//    @Scope("prototype") //改为多实例
    @Bean
    @Lazy
    public Person person(){
        System.out.println("给容器中添加Person。。。");
        return new Person("lisi",23);
    }

    /**
     * @Conditional({condition})
     * 按照一定的条件进行判断：满足条件给容器中注册bean
     *
     * 如果是Windows系统：给容器注入 bill
     * 如果是Linux系统：给容器注入 Linux
     * @return
     */
    @Conditional(WindowsCondition.class)
    @Bean("bill")
    public Person person01(){
        return new Person("bill gaici",62);
    }
    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person person002(){
        return new Person("linux",43);
    }
}
