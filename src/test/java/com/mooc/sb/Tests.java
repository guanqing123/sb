package com.mooc.sb;

import com.mooc.sb.condi.Cond;
import com.mooc.sb.ioc.xml.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 16:31
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(locations = "classpath:ioc/demo.xml")
public class Tests {

    @Autowired
    private HelloService helloService;

    @Test
    public void testHello(){
        System.out.println(helloService.student());
    }

    @Test
    public void testStu2(){
        System.out.println(helloService.stu2());
    }

    @Test
    public void testAnimal(){
        System.out.println(helloService.animal());
    }

    @Test
    public void testInstance(){
        System.out.println(helloService.instance());
    }
}
