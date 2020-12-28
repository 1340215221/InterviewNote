package com.rh.code.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * 该字段, 前端传入true或false, 后台的类型为0,1
     */
    @JsonDeserialize(using = JsonBool2Int.class, as = Integer.class, contentAs = Boolean.class)
    private Integer visible;

    /**
     * 将名字为 v 的属性解析到改字段, 转json时, 该字段的属性名改为 v
     */
    @JsonProperty("v")
    private Integer editable;

    /**
     * 在转json时, 对象的属性会上升到父类属性同级, 实现扁平化
     */
    @JsonUnwrapped
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public static class Name implements Serializable {
        private String realName;
        private String showName;

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }
    }

}
