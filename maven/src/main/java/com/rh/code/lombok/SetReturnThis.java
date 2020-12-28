package com.rh.code.lombok;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SetReturnThis {
    private String name;

    public static void main(String[] args) {
        SetReturnThis bean = new SetReturnThis().setName("rh");
    }
}
