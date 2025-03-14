package com.fay.faypicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * ClassName: UserRoleEnum
 * Package: com.fay.faypicturebackend.model.enums
 * Description: 对于用户角色这样值的数量有限的、可枚举的字段，定义一个枚举类
 * 便于在项目中获取值、减少枚举值输入错误的情况
 *
 * @Author: FLFfang
 * @Create: 2025/3/11 - 11:02
 */
@Getter
public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin");

    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        for (UserRoleEnum anEnum : UserRoleEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

}
