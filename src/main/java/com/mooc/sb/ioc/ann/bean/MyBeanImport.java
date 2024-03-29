package com.mooc.sb.ioc.ann.bean;

import com.mooc.sb.ioc.ann.B;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 配置bean方式五 实现ImportBeanDefinitionRegistrar
 * @Author guanqing
 * @Date 2021/5/5 18:36
 **/
public class MyBeanImport implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(B.class);
        registry.registerBeanDefinition("bird", rootBeanDefinition);
    }
}
