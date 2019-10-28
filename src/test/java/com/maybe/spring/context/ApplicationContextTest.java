package com.maybe.spring.context;

import org.junit.Test;

public class ApplicationContextTest {

    @Test
    public void load() {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.load();
    }
}