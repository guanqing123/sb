package com.mooc.sb.event.boardcast;

import com.mooc.sb.event.boardcast.EventMulticaster;
import com.mooc.sb.event.event.WeatherEvent;
import com.mooc.sb.event.listener.WeatherListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:40
 **/
public abstract class AbstractEventMulticaster implements EventMulticaster {

    private List<WeatherListener> listenerList = new ArrayList<>();

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(weatherListener -> weatherListener.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener weatherListener) {
        listenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }

    abstract void doStart();

    abstract void doEnd();
}
