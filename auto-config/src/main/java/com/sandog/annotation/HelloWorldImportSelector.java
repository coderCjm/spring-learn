package com.sandog.annotation;

import com.sandog.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by sandog on 2018/12/18.
 */
public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {HelloWorldConfiguration.class.getName()};
    }

}