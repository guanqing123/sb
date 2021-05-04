package com.mooc.sb.event.boardcast;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/4 14:52
 **/
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
