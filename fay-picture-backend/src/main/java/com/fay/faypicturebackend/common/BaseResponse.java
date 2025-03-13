package com.fay.faypicturebackend.common;

import com.fay.faypicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: BaseResponse
 * Package: com.fay.faypicturebackend.common
 * Description: 一般情况下，每个后端接口都要返回调用码、数据、调用信息等，前端可以根据这些信息进行相应的处理。
 * 我们可以封装统一的响应结果类，便于前端统一获取这些信息
 *
 * @Author: FLFfang
 * @Create: 2025/3/10 - 11:11
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}
