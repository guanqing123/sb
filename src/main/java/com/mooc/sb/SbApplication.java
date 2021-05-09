package com.mooc.sb;

import com.mooc.sb.initializer.SecondInitializer;
import com.mooc.sb.ioc.ann.MyBeanImport;
import com.mooc.sb.listener.SecondListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@MapperScan("com.mooc.sb.mapper")
@Import(MyBeanImport.class) //运行需要打开（和 test里面的 import冲突,所以才注释掉）
public class SbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbApplication.class, args);
/*        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.addListeners(new SecondListener());
        springApplication.run(args);*/

/*        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));
        springApplication.run(args);*/

//        System.out.println("\u001B[32m :: Spring Boot :: ");
    }
}
