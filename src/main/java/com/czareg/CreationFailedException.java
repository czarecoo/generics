package com.czareg;

public class CreationFailedException extends Throwable {
    public CreationFailedException(String s, ReflectiveOperationException e) {
        super(s, e);
    }
}
