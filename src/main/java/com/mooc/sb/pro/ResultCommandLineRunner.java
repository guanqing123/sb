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
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware, MyAware {

    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(env.getProperty("mooc.website.url") +"\t"+ env.getProperty("hello"));
        System.out.println(env.getProperty("mooc.avg.age"));
        System.out.println(env.getProperty("mooc.website.path"));
        System.out.println(env.getProperty("mooc.vm.name"));
        System.out.println(flag.isCanOperate());
        System.out.println(env.getProperty("mooc.default.name"));
        System.out.println(env.getProperty("mooc.active.name") +"\t"+ env.getProperty("mooc.active2.name"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }

    private Flag flag;

    @Override
    public void setFlag(Flag fla) {
        flag = fla;
    }
}
