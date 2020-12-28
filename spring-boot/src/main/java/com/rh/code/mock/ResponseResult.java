package com.rh.code.mock;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseResult implements Serializable {

    private Object data;

    public static ResponseResult ok(Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(data);
        return responseResult;
    }

}
