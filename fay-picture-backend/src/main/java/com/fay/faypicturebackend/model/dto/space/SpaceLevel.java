package com.fay.faypicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ClassName: SpaceLevel
 * Package: com.fay.faypicturebackend.model.dto.space
 * Description: 空间级别
 *
 * @Author: FLFfang
 * @Create: 2025/3/21 - 10:37
 */

@Data
@AllArgsConstructor
public class SpaceLevel {

    /**
     * 值
     */
    private int value;

    /**
     * 中文
     */
    private String text;

    /**
     * 最大数量
     */
    private long maxCount;

    /**
     * 最大容量
     */
    private long maxSize;
}
