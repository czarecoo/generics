package com.czareg;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Creator <T> {
    private Class<T> type;

    public Creator(Class<T> type) {
        this.type = type;
    }

    public T create(List<Class<?>>constructorParamsTypes, List<Object> constructorParamsValues) throws CreationFailedException {
        try {
            Class[] classes = constructorParamsTypes.stream().toArray(Class[]::new);
            Object[] objects = constructorParamsValues.stream().toArray(Object[]::new);
            return type.getConstructor(classes).newInstance(objects);
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new CreationFailedException("Failed to create object of type "+type.toString(), e);
        }
    }
}
