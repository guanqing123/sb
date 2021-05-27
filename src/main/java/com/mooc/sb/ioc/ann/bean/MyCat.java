package com.mooc.sb.ioc.ann.bean;

import com.mooc.sb.ioc.ann.Ani;
import com.mooc.sb.ioc.ann.C;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 配置bean方式三 实现FactoryBean
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
