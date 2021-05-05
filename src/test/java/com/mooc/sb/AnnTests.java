package com.mooc.sb;

import com.mooc.sb.ioc.ann.AnnService;
import com.mooc.sb.ioc.ann.MyBeanImport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 17:59
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MyBeanImport.class)
public class AnnTests {

    @Autowired
    private AnnService annService;

    @Test
    public void testAni(){
        System.out.println(annService.ani());
    }

}
