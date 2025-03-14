package com.fay.faypicturebackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: AuthCheck
 * Package: com.fay.faypicturebackend.annotation
 * Description:
 *
 * @Author: FLFfang
 * @Create: 2025/3/11 - 20:00
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 必须具有某个角色
     *
     * @return
     */
    String mustRole() default "";
}
