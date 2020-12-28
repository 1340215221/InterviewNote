package com.rh.code.mock;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * 给父类的私有属性赋值
 * ReflectionTestUtils.setField() 的使用示例
 */
public class HandleSuperPrivateField {

    private User user = new User("rh");

    /**
     * 给父类的私有属性赋值
     * 通过 ReflectionTestUtils.setField()
     */
    @Test
    public void setField() {
        ReflectionTestUtils.setField(user, "name", "wy");
        assert ((Homen) user).name == "wy";
    }

    @AllArgsConstructor
    private class Homen {
        private String name;
    }

    private class User extends Homen {
        public User(String name) {
            super(name);
        }
    }

}
