package com.roro.openautoconfigprinciple.compent;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.roro.openautoconfigprinciple.compent.MyServiceImpl"};
    }
}
