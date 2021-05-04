package com.mooc.sb.event.listener;

import com.mooc.sb.event.event.SnowEvent;
import com.mooc.sb.event.event.WeatherEvent;
import com.mooc.sb.event.listener.WeatherListener;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:32
 **/
@Component
public class SnowListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
