package com.mooc.sb.execpt;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.boot.web.embedded.tomcat.ConnectorStartFailedException;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/17 16:57
 **/
@Component
public class MyExitCodeExceptionMapper implements ExitCodeExceptionMapper {
    @Override
    public int getExitCode(Throwable exception) {
        if (exception instanceof ConnectorStartFailedException) {
            return 10;
        }
        return 0;
    }
}
