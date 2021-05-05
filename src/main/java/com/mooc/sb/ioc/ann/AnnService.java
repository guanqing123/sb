package com.mooc.sb.ioc.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
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
