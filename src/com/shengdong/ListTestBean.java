package com.shengdong;

import java.util.List;

//该类用于注入有序集合List
public class ListTestBean {

    private List<String> values;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
