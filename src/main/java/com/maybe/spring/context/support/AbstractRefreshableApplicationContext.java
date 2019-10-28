package com.maybe.spring.context.support;

import com.maybe.spring.beans.factory.AbstractBeanFactory;
import com.maybe.spring.beans.factory.support.DefaultListableBeanFactory;

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {


    private DefaultListableBeanFactory beanFactory;

    @Override
    public AbstractBeanFactory getBeanFactroy() {
        return this.beanFactory;
    }


    protected DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }


    @Override
    protected void refreshBeanFactory() {
        beanFactory = null;

        DefaultListableBeanFactory defaultListableBeanFactory = createBeanFactory();
        loadBeanDefinitions(defaultListableBeanFactory);
        beanFactory = defaultListableBeanFactory;
    }


    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

}
