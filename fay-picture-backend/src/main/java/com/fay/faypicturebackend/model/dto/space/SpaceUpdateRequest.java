package com.fay.faypicturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SpaceUpdateRequest
 * Package: com.fay.faypicturebackend.model.dto.space
 * Description: 空间更新请求
 *
 * @Author: FLFfang
 * @Create: 2025/3/20 - 18:05
 */
@Data
public class SpaceUpdateRequest implements Serializable {

    /**
     * 空间 id
     */
    private Long id;

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     * 空间级别：0-普通版 1-专业版 2-旗舰版
     */
    private Integer spaceLevel;

    /**
     * 空间图片的最大总大小
     */
    private Long maxSize;

    /**
     * 空间图片的最大数量
     */
    private Long maxCount;

    private static final long serialVersionUID = 1L;
}
