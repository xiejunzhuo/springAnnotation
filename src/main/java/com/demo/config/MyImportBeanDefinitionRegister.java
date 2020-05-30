package com.demo.config;

import com.demo.bean.RainRow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 18:44
 */
//注入组件
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainRow.class);
        beanDefinitionRegistry.registerBeanDefinition("rainRow",rootBeanDefinition);
    }
}
