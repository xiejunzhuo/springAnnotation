package com.demo.config;


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 17:44
 */
//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    /**
     * //返回值，就是到导入到容器中的组件全类名
     * 	//AnnotationMetadata:当前标注@Import注解的类的所有注解信息
     * @param annotationMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();

        for (String name : annotationTypes){
            System.out.println(name);
        }
        return new String[]{"com.demo.bean.Blue","com.demo.bean.red"};
    }
    /**
     * 给容器中注册组件；
     * 1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2）、@Bean[导入的第三方包里面的组件]
     * 3）、@Import[快速给容器中导入一个组件]
     *        1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     *        2）、ImportSelector:返回需要导入的组件的全类名数组；
     *        3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）、使用Spring提供的 FactoryBean（工厂Bean）;
     *        1）、默认获取到的是工厂bean调用getObject创建的对象
     *        2）、要获取工厂Bean本身，我们需要给id前面加一个&
     *           &colorFactoryBean
     */
}
