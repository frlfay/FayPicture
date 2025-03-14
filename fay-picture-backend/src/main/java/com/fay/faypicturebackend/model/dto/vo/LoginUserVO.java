package com.fay.faypicturebackend.model.dto.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: LoginUserVO
 * Package: com.fay.faypicturebackend.model.dto.vo
 * Description:
 *
 * @Author: FLFfang
 * @Create: 2025/3/11 - 12:27
 */
@Data
public class LoginUserVO implements Serializable {

    /**
     * 用户 id
     */
    private Long id;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

}
