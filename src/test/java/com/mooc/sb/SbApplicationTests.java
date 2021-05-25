package com.mooc.sb;

import com.mooc.sb.condi.Cond;
import com.mooc.sb.event.WeatherRunListener;
import com.mooc.sb.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@TestPropertySource({"demo.properties"})
//@SpringBootTest(properties = {"mooc.website.url=mooc_url_9"})
@SpringBootTest(classes = {SbApplication.class})
public class SbApplicationTests implements ApplicationContextAware {

    private Logger logger = LoggerFactory.getLogger(SbApplicationTests.class);

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

    @Test
    public void testCond(){
        System.out.println(applicationContext.getBean(Cond.class));
    }

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testRedis() throws InterruptedException {
        redisUtil.set("mooc", "test", 3);
        System.out.println("mooc1>>" + redisUtil.get("mooc"));
        Thread.sleep(3000);
        System.out.println("mooc2>>"+ redisUtil.get("mooc"));
    }
}
