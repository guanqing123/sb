package com.mooc.sb.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/12 20:46
 **/
@Component
@Order(2)
public class SecondCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\u001B[32m >>> startup second runner <<<");
    }
}
