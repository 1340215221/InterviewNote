package com.rh.code.groovy;

import com.rh.code.groovy.util.Code;

import java.util.List;
import java.util.Map;

public class Homen {

    private String name;
    private Integer age;
    private List<String> list;
    private Map<String, Integer> map;
    private Code code;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
