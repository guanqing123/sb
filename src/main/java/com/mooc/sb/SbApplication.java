package com.mooc.sb;

import com.mooc.sb.initializer.SecondInitializer;
import com.mooc.sb.ioc.ann.MyBeanImport;
import com.mooc.sb.listener.SecondListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StopWatch;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.mooc.sb.mapper")
@Import(MyBeanImport.class) //运行需要打开（和 test里面的 import冲突,所以才注释掉）
@PropertySource({"demo.properties"})
public class SbApplication {
    public static void main(String[] args) throws InterruptedException {
//        SpringApplication.run(SbApplication.class, args);

/*        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.addListeners(new SecondListener());
        springApplication.run(args);*/

/*        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));
        springApplication.run(args);*/

//        System.out.println("\u001B[32m :: Spring Boot :: ");

/*        StopWatch myWatch = new StopWatch("myWatch");
        myWatch.start("task1");
        Thread.sleep(2000l);
        myWatch.stop();
        myWatch.start("task2");
        Thread.sleep(3000l);
        myWatch.stop();
        myWatch.start("task3");
        Thread.sleep(1000l);
        myWatch.stop();
        System.out.println(myWatch.prettyPrint());*/

        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        Properties properties = new Properties();
        properties.setProperty("mooc.website.url", "mooc_url_1");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }
}
