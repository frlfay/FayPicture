package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: searchPictureByColorRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 通过颜色搜索
 *
 * @Author: FLFfang
 * @Create: 2025/3/29 - 16:56
 */
@Data
public class SearchPictureByColorRequest implements Serializable {

    /**
     * 图片主色调
     */
    private String picColor;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}