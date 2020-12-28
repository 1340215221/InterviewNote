package com.rh.code.lombok;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Delegate;

public class FlatObject {

    @Delegate
    @NonNull
    private Door door = new Door(); // 该对象不能为null

    public static void main(String[] args) throws Exception {
        FlatObject bean = new FlatObject();
        bean.getName();
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(bean);
        System.out.println(s); // {"name":null}
    }

    @Data
    public static class Door {
        private String name;
    }
}
