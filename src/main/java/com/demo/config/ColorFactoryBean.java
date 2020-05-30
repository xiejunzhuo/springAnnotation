package com.demo.config;

import com.demo.bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 *
 * 4.创建一个Spring定义的FactoryBean
 * 给容器中注入组件
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 20:53
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    /**
     * 返回一个Color对象，这个对象会添加到容器中
     * @return
     * @throws Exception
     */
    public Color getObject() throws Exception {

        System.out.println("getObject....");
        return new Color();
    }

    /**
     * 返回对象类型
      * @return
     */
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否单例
     * 	true：这个bean是单实例，在容器中保存一份
     * 	false：多实例，每次获取都会创建一个新的bean；
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
