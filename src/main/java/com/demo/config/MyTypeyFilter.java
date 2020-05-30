package com.demo.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/24 21:34
 */
public class MyTypeyFilter implements TypeFilter {

    /**
     * 自定义
     *
     * @param metadataReader 读取到的当前扫描的类的信息
     * @param metadataReaderFactory 可以获取到其他任何类信息的
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
       //获取当前注释的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println(className);
        if (className.contains("er")){
            return true;
        }
        return false;
    }
}
