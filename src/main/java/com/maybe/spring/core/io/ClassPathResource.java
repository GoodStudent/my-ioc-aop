package com.maybe.spring.core.io;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathResource implements Resource {

    private final String path;


    public ClassPathResource(String path) {
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.getClass().getResourceAsStream(path);
    }
}
