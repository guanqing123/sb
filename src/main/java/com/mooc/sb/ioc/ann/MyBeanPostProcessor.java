package com.mooc.sb.ioc.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 21:46
 **/
@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    // applyBeanPostProcessorsBeforeInstantiation
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("worker")){
            return new Worker();
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("worker")){
            Worker worker = (Worker) bean;
            worker.setName("看看谁成功");
            return worker;
        }
        return null;
    }

    // Caused by: java.lang.IllegalArgumentException: Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
/*    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("worker")){
            Worker worker = (Worker) bean;
            worker.setName("动态添加名字");
        }
        return false;
    }*/
}
