package com.fay.faypicturebackend.exception;

import lombok.Getter;

/**
 * ClassName: ErrorCode
 * Package: com.fay.faypicturebackend.exception
 * Description: 自定义错误码，对错误进行收敛，便于前端统一处理
 * - HTTP 400 （4开头表示用户传的参数有问题 bad request)
 * - 401表示没权限未授权
 * - 403表示被禁止 forbidden
 * - 404表示没资源，请求数据不存在
 * - 500表示服务器的错误
 *
 * @Author: FLFfang
 * @Create: 2025/3/10 - 11:04
 */

@Getter
public enum ErrorCode {
    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    NO_AUTH_ERROR(40101, "无权限"),
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    FORBIDDEN_ERROR(40300, "禁止访问"),
    SYSTEM_ERROR(50000, "系统内部异常"),
    OPERATION_ERROR(50001, "操作失败");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
