package com.maybe.spring.core.io;

public class DefaultResourceLoader implements ResoureLoader {

    @Override
    public Resource getResource(String location) {
        return new ClassPathResource(location);
    }
}
