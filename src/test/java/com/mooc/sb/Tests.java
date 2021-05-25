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
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

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

    @Test
    public void testResource() throws IOException {
        ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
        Enumeration<URL> urls = classLoader.getResources(SpringFactoriesLoader.FACTORIES_RESOURCE_LOCATION);
        LinkedMultiValueMap<String, String> result = new LinkedMultiValueMap<>();
        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            UrlResource resource = new UrlResource(url);
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);
            for (Map.Entry<?,?> entry: properties.entrySet()) {
                System.out.println("key="+ entry.getKey() +"\t value="+ entry.getValue());
                String factoryClassName = ((String) entry.getKey()).trim();
                for (String factoryName: StringUtils.commaDelimitedListToStringArray((String) entry.getValue())){
                    result.add(factoryClassName, factoryName);
                }
            }
        }

        result.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }
}
