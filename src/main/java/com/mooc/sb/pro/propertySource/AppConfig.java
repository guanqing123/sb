package com.mooc.sb.pro.propertySource;

import com.mooc.sb.event.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/28 9:44
 **/
@Configuration
//@PropertySource("classpath:application.yml")
public class AppConfig {

    @Autowired
    Environment env;

    @Bean
    public TestBean testBean(){
        TestBean testBean = new TestBean();
        testBean.setName(env.getProperty("testbean.name"));
        return testBean;
    }
}
