package com.czareg;

import java.util.ArrayList;
import java.util.List;

public class Extractor<T, R> {
    private Class<T> type;

    public Extractor(Class<T> type) {
        this.type = type;
    }

    public List<T> extract(List<R> list) {
        List<T> tList = new ArrayList<>();
        for (R r : list) {
            if (type.isInstance(r)) {
                T t = type.cast(r);
                tList.add(t);
            }
        }
        return tList;
    }
}
