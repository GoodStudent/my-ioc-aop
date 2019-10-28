package com.maybe.spring.beans.factory.json;

import com.maybe.spring.beans.factory.support.BeanDefinitionReader;
import com.maybe.spring.beans.factory.support.BeanDefinitionRegistry;

import javax.annotation.Resource;

public class JsonBeanDefinitionReader implements BeanDefinitionReader {

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return null;
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return null;
    }

    @Override
    public int loadBeanDefinitions(Resource resource) {
        return 0;
    }
}
