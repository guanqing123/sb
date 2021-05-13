package com.mooc.sb;

import com.mooc.sb.event.WeatherRunListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestPropertySource({"demo.properties"})
@SpringBootTest(properties = {"mooc.website.url=mooc_url_9"})
public class SbApplicationTests implements EnvironmentAware {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    public void contextLoads() {
        environment.getProperty("mooc.website.url");
    }

    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        environment = environment;
    }
}
