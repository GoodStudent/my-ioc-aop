package com.maybe.spring.beans.factory.support;

import com.maybe.spring.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {


    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
