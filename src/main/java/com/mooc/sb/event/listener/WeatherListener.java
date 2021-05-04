package com.mooc.sb.event.listener;

import com.mooc.sb.event.event.WeatherEvent;

public interface WeatherListener {

    void onWeatherEvent(WeatherEvent event);
}
