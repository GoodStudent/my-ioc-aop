package com.maybe.spring.beans.factory.support;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry beanDefinitionRegistry;


    public AbstractBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return this.beanDefinitionRegistry;
    }

}
