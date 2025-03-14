package com.fay.faypicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: UserRegisterRequest
 * Package: com.fay.faypicturebackend.model.dto.user
 * Description: 接受请求参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/11 - 11:10
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 2864510783389187586L;//这个可以通过IDEA生成的

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;

}
