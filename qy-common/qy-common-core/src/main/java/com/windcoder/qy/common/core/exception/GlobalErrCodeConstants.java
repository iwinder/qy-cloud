package com.windcoder.qy.common.core.exception;

/**
 * 全局通用状态
 * 6位标识 100000
 * 10 服务-通用
 * 00 模块-基本错误
 * 00 错误码序号
 *
 */
public interface GlobalErrCodeConstants {
    ErrCode SUCCESS = new ErrCode(100000, "成功");
    ErrCode ERR_BAD_REQUEST = new ErrCode(100001, "请求参数不正确");
    ErrCode ERR_UNAUTHORIZED = new ErrCode(100002, "账号未登录");
    ErrCode ERR_FORBIDDEN = new ErrCode(100003, "没有操作权限");
    ErrCode ERR_TOO_MANY = new ErrCode(100004, "请求过于频繁，请稍后重试");
}
