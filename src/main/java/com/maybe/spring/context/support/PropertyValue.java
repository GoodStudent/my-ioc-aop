package com.maybe.spring.context.support;

import lombok.Data;

@Data
public class PropertyValue {

    private String property;

    private Object value;

    private String ref;

    private boolean optional;

    private boolean converted;

    private Object convertedValue;

    private boolean convertNecessary;

}