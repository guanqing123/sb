package com.mooc.sb.ioc.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 18:03
 **/
@Configuration
public class BeanConfiguration {
    @Bean("dog")
    Ani getDog(){
        return new D();
    }
}
