package com.rh.code.mongo.util;

import lombok.Data;

/**
 * 模拟从mongo中查询出来的实体对象
 */
@Data
public class Process {

    private String _id;
    private String name;

    public String getId() {
        return this._id;
    }

}
