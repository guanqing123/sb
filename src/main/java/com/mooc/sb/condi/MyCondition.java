package com.mooc.sb.condi;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/19 14:23
 **/
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String[] properties = (String[]) metadata.getAnnotationAttributes("com.mooc.sb.condi.MyConditionAnnotation").get("value");
        for (String property : properties) {
            if (StringUtils.isEmpty(context.getEnvironment().getProperty(property))){
                return false;
            }
        }
        return true;
    }
}
