package com.fay.faypicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: UserLoginRequest
 * Package: com.fay.faypicturebackend.model.dto.user
 * Description:
 *
 * @Author: FLFfang
 * @Create: 2025/3/11 - 12:19
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 2864510783389187586L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
