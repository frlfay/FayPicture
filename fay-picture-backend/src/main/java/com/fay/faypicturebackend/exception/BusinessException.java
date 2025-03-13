package com.fay.faypicturebackend.exception;

import lombok.Getter;

/**
 * ClassName: BusinessException
 * Package: com.fay.faypicturebackend.exception
 * Description: 自定义一个业务异常，和内置的异常类区分开，便于定制化输出错误信息
 *
 * @Author: FLFfang
 * @Create: 2025/3/10 - 11:07
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
