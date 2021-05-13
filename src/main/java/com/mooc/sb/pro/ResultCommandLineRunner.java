package com.mooc.sb.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/13 20:05
 **/
@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {

    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(env.getProperty("mooc.website.url") +"\t"+ env.getProperty("hello"));
        System.out.println(env.getProperty("mooc.avg.age"));
        System.out.println(env.getProperty("mooc.website.path"));
        System.out.println(env.getProperty("mooc.vm.name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }
}
