package com.mooc.sb.ioc.ann.bean;

import com.mooc.sb.ioc.ann.Ani;
import com.mooc.sb.ioc.ann.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 配置bean方式二 @Bean
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
