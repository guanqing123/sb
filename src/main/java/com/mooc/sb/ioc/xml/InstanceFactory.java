package com.mooc.sb.ioc.xml;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 17:24
 **/
public class InstanceFactory {

    public Animal getAnimal(String type){
        if ("dog".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
