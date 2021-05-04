package com.mooc.sb;

import com.mooc.sb.initializer.SecondInitializer;
import com.mooc.sb.listener.SecondListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mooc.sb.mapper")
public class SbApplication {
    public static void main(String[] args) {
//        SpringApplication.run(SbApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SbApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.addListeners(new SecondListener());
        springApplication.run(args);
    }
}
