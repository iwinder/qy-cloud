/**
 *  异常相关通用设计
 *
 *  异常码使用六位数字编码。2位服务+2位模块+2位编码序号，
 *  如 100000
 *  10 服务-通用
 *  00 模块-基本错误
 *  00 错误码序号
 *
 *  服务：
 *  10 通用服务
 *  11 system 用户系统
 *  12 bpm 流程系统
 *
 */
package com.windcoder.qy.common.core.exception;