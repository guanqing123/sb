package com.mooc.sb.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/18 13:50
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("MyImportSelector");
        return new String[]{"com.mooc.sb.ioc.xml.Cat","com.mooc.sb.ioc.xml.Dog"};
    }
}
