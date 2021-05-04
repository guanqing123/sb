package com.mooc.sb.event.listener;

import com.mooc.sb.event.event.RainEvent;
import com.mooc.sb.event.event.WeatherEvent;
import com.mooc.sb.event.listener.WeatherListener;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:33
 **/
public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
