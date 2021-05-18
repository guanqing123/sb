package com.mooc.sb;

import com.mooc.sb.execpt.AException;
import com.mooc.sb.execpt.BException;
import com.mooc.sb.execpt.CException;
import com.mooc.sb.execpt.Solid;
import com.mooc.sb.initializer.SecondInitializer;
import com.mooc.sb.ioc.ann.MyBeanImport;
import com.mooc.sb.listener.SecondListener;
import com.mooc.sb.selector.MyDeferredImportSelector;
import com.mooc.sb.selector.MyImportSelector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StopWatch;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.mooc.sb.mapper")
@Import({MyBeanImport.class, MyImportSelector.class, MyDeferredImportSelector.class}) //运行需要打开（和 test里面的 import冲突,所以才注释掉）
@PropertySource({"demo.properties"})
@ImportResource("ioc/demo.xml")
public class SbApplication {

/*    @Autowired
    private Solid solid;*/

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

/*        try {
            throw new CException(new BException(new AException(new Exception("test"))));
        } catch (Throwable t) {
            while (t != null){
                System.out.println(t.getClass());
                t = t.getCause();
            }
        }*/

/*        System.out.println("hello");
        Thread close_jvm = new Thread(() -> System.out.println("close jvm"));
        Runtime.getRuntime().addShutdownHook(close_jvm);
        System.out.println("world");
        Runtime.getRuntime().removeShutdownHook(close_jvm);*/

        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        Properties properties = new Properties();
        properties.setProperty("mooc.website.url", "mooc_url_1");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }
}
