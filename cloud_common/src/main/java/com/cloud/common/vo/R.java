package com.cloud.common.vo;

import lombok.Data;

/**
 * @program: Cloud1908
 * @description:
 * @author: Feri
 * @create: 2019-12-24 10:10
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    //无参构造一定要加  否则反射方法创建实例会出问题
    public R() {
    }
}
