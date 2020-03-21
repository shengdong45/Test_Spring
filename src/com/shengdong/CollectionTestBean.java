package com.shengdong;

import java.util.Collection;

//该类用于注入无序集合Set
public class CollectionTestBean {

    private Collection<String> values;

    public void setValues(Collection<String> values) {
        this.values = values;
    }

    public Collection<String> getValues() {
        return values;
    }
}
