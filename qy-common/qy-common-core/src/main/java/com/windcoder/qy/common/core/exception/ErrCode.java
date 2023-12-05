package com.windcoder.qy.common.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ErrCode {
    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;

    public ErrCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
