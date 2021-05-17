package com.mooc.sb.execpt;

import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/17 18:02
 **/
public class MyExceptionReporter implements SpringBootExceptionReporter {

    private ConfigurableApplicationContext context;

    public MyExceptionReporter(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @Override
    public boolean reportException(Throwable failure) {
        if (failure instanceof UnsatisfiedDependencyException) {
            UnsatisfiedDependencyException exception = (UnsatisfiedDependencyException) failure;
            System.out.println("no such bean "+ exception.getInjectionPoint().getField().getName());
        }
/*        try {
            for (SpringBootExceptionReporter reporter : exceptionReporters) {
                if (reporter.reportException(failure)) {
                    registerLoggedException(failure);
                    return;
                }
            }
        }*/
        return false;
    }
}
