package com.mooc.sb.event.event;

import com.mooc.sb.event.event.WeatherEvent;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:25
 **/
public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "rain";
    }
}
