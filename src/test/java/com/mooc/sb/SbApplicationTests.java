package com.mooc.sb;

import com.mooc.sb.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEvent(){
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

}
