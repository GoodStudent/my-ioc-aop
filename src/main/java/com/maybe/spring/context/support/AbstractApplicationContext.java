package com.maybe.spring.context.support;

import com.maybe.spring.beans.factory.AbstractBeanFactory;
import com.maybe.spring.context.ApplicationContext;

public abstract class AbstractApplicationContext implements ApplicationContext {


    public AbstractApplicationContext() {
    }


    public abstract AbstractBeanFactory getBeanFactroy();


    @Override
    public Object getBean(String beanName) {
        return getBeanFactroy().getBean(beanName);
    }


    private void prepareRefresh() {

    }


    protected abstract void refreshBeanFactory();


    protected AbstractBeanFactory obtainFreshBeanFactory() {
        refreshBeanFactory();
        return getBeanFactroy();
    }

    protected void prepareBeanFactory(AbstractBeanFactory beanFactory) {

    }

    protected void postProcessBeanFactory(AbstractBeanFactory beanFactory) {

    }

    protected void invokeBeanFactoryPostProcessors(AbstractBeanFactory beanFactory) {

    }

    protected void registerBeanPostProcessors(AbstractBeanFactory beanFactory) {
    }


    protected void initMessageSource() {

    }

    protected void initApplicationEventMulticaster() {

    }


    protected void onRefresh() {
        getBeanFactroy().preInstantiateSingletons();
    }



    protected void registerListeners() {

    }


    protected void finishBeanFactoryInitialization(AbstractBeanFactory beanFactory) {

    }


    protected void finishRefresh() {

    }


    protected void refresh() {
        // Prepare this context for refreshing.
        prepareRefresh();

        // Tell the subclass to refresh the internal bean factory.
        AbstractBeanFactory beanFactory = obtainFreshBeanFactory();

        // Prepare the bean factory for use in this context.
        prepareBeanFactory(beanFactory);


        // Allows post-processing of the bean factory in context subclasses.
        postProcessBeanFactory(beanFactory);

        // Invoke factory processors registered as beans in the context.
        invokeBeanFactoryPostProcessors(beanFactory);

        // Register bean processors that intercept bean creation.
        registerBeanPostProcessors(beanFactory);

        // Initialize message source for this context.
        initMessageSource();

        // Initialize event multicaster for this context.
        initApplicationEventMulticaster();

        // Initialize other special beans in specific context subclasses.
        onRefresh();

        // Check for listener beans and register them.
        registerListeners();

        // Instantiate all remaining (non-lazy-init) singletons.
        finishBeanFactoryInitialization(beanFactory);

        // Last step: publish corresponding event.
        finishRefresh();

    }



}
