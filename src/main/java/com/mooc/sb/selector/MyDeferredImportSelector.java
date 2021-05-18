package com.mooc.sb.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/18 13:57
 **/
public class MyDeferredImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MyDeferredImportSelector");
        return new String[]{"com.mooc.sb.ioc.xml.Stu2","com.mooc.sb.ioc.xml.Student"};
    }
}
