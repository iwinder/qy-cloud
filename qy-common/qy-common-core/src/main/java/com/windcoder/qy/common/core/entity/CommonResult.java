package com.windcoder.qy.common.core.entity;

import com.windcoder.qy.common.core.exception.ErrCode;
import com.windcoder.qy.common.core.exception.GlobalErrCodeConstants;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Objects;

public class CommonResult <T> implements Serializable {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String msg;
    /**
     * 引用，用于指定可以解决这个错误的文档链接地址（可选）
     */
    private String reference;

    /**
     * 返回数据
     */
    private T data;



    public static <T> CommonResult<T> error(Integer code, String message,String reference) {
        // 当表达式为 false 时，才会触发后面的异常提示
        Assert.isTrue(!GlobalErrCodeConstants.SUCCESS.getCode().equals(code), "code 必须是错误的！");
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = message;
        result.reference = reference;
        return result;
    }

    public static <T> CommonResult<T> error(ErrCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMsg(),null);
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = GlobalErrCodeConstants.SUCCESS.getCode();
        result.data = data;
        result.msg = "";
        return result;
    }
}
