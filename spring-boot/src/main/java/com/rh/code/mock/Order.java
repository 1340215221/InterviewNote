package com.rh.code.mock;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Order implements Serializable {

    private String name;
    private String displayName;

}
