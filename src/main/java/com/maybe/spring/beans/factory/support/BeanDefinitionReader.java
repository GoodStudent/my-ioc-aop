package com.maybe.spring.beans.factory.support;


import javax.annotation.Resource;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    /**
     * Return the class loader to use for bean classes.
     * <p>{@code null} suggests to not load bean classes eagerly
     * but rather to just register bean definitions with class names,
     * with the corresponding Classes to be resolved later (or never).
     */
    ClassLoader getBeanClassLoader();



    int loadBeanDefinitions(Resource resource);


}
