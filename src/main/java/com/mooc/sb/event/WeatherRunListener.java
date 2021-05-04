package com.mooc.sb.event;

import com.mooc.sb.event.boardcast.WeatherEventMulticaster;
import com.mooc.sb.event.event.RainEvent;
import com.mooc.sb.event.event.SnowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 16:31
 **/
@Component
public class WeatherRunListener {

    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow(){
        eventMulticaster.multicastEvent(new SnowEvent());
    }

    public void rain(){
        eventMulticaster.multicastEvent(new RainEvent());
    }
}
