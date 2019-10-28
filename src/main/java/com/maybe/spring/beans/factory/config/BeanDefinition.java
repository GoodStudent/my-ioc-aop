package com.maybe.spring.beans.factory.config;

import com.maybe.spring.context.support.PropertyValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeanDefinition {

    private String beanId;

    private String className;

    private PropertyValue[] propertyValues;
}
