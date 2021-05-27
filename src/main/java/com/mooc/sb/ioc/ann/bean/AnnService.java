package com.mooc.sb.ioc.ann.bean;

import com.mooc.sb.ioc.ann.Ani;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 配置bean方式一 @Component
 * @Author guanqing
 * @Date 2021/5/5 18:00
 **/
@Component
public class AnnService {

    @Autowired
//    @Qualifier("myCat")
//    @Qualifier("monkey")
    @Qualifier("bird")
    private Ani ani;

    public String ani(){
        return ani.getName();
    }
}
