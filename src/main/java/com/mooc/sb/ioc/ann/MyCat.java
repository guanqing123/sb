package com.mooc.sb.ioc.ann;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 18:23
 **/
@Component
public class MyCat implements FactoryBean<Ani> {
    @Override
    public Ani getObject() throws Exception {
        return new C();
    }

    @Override
    public Class<?> getObjectType() {
        return Ani.class;
    }
}
