package com.mooc.sb.condi;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/19 11:01
 **/
@Component
//@ConditionalOnProperty("com.mooc.condition")
@MyConditionAnnotation({"com.mooc.mycondition1", "com.mooc.mycondition2"})
public class Cond {
}
