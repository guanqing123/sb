package com.mooc.sb.event;

import com.mooc.sb.event.boardcast.WeatherEventMulticaster;
import com.mooc.sb.event.event.RainEvent;
import com.mooc.sb.event.event.SnowEvent;
import com.mooc.sb.event.listener.RainListener;
import com.mooc.sb.event.listener.SnowListener;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:56
 **/
public class Test {
    public static void main(String[] args) {
        // 广播器
        WeatherEventMulticaster weatherEventMulticaster = new WeatherEventMulticaster();

        // 监听器
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();

        // 广播器添加监听器
        weatherEventMulticaster.addListener(rainListener);
        weatherEventMulticaster.addListener(snowListener);

        // 广播器广播事件
        weatherEventMulticaster.multicastEvent(new SnowEvent());
        weatherEventMulticaster.multicastEvent(new RainEvent());

        // 广播器移除监听器
        weatherEventMulticaster.removeListener(rainListener);
        // 广播器继续广播事件
        weatherEventMulticaster.multicastEvent(new RainEvent());
        weatherEventMulticaster.multicastEvent(new SnowEvent());
    }
}
