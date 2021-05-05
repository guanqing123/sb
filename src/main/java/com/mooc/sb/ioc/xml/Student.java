package com.mooc.sb.ioc.xml;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @description: TODO 无参构造
 * @Author guanqing
 * @Date 2021/5/5 10:58
 **/
@Getter
@Setter
public class Student {

    private String name;

    private Integer age;

    private List<String> classList;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classList=" + String.join(",", classList) +
                '}';
    }
}
