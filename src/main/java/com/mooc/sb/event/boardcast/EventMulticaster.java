package com.mooc.sb.event.boardcast;

import com.mooc.sb.event.event.WeatherEvent;
import com.mooc.sb.event.listener.WeatherListener;

public interface EventMulticaster {

    void multicastEvent(WeatherEvent event);

    void addListener(WeatherListener weatherListener);

    void removeListener(WeatherListener weatherListener);
}
