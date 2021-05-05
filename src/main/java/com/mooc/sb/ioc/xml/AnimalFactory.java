package com.mooc.sb.ioc.xml;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 17:07
 **/
public class AnimalFactory {

    public static Animal getAnimal(String type) {
        if ("dog".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
