package com.mooc.sb.ioc.ann;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 21:26
 **/
@Component
@DependsOn("myCat")
public class Worker {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
