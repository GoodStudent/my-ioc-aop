package com.maybe.spring.test;

import lombok.Data;

@Data
public class Man {

    private Integer age;

    private String name;

    private Woman wife;
}
