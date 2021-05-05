package com.mooc.sb.ioc.xml;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @description: TODO 有参构造
 * @Author guanqing
 * @Date 2021/5/5 16:55
 **/
@Getter
@Setter
public class Stu2 {

    private String name;

    private Integer age;

    private List<String> classList;

    public Stu2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classList=" + String.join(",", classList) +
                '}';
    }
}
