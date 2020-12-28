package com.rh.code.mongo.util;

import lombok.experimental.Delegate;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 模拟mongo拼接数据 <br>
 * 模拟 org.bson.Document
 */
public class Document implements Map<String, Object> {

    @Delegate
    private final Map<String, Object> map = new LinkedHashMap<>();

    public Document() {
    }

    public Document(String key, Object obj) {
        map.put(key, obj);
    }

    public Document(Map<String, Object> map) {
        if (map != null) {
            this.map.putAll(map);
        }
    }

}
