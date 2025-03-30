package com.fay.faypicturebackend.model.dto.space.analyze;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SpaceAnalyzeRequest
 * Package: com.fay.faypicturebackend.model.dto.space.analyze
 * Description: 公共的图片分析请求封装类，便于各个具体的分析请求封装类直接继承
 *
 * @Author: FLFfang
 * @Create: 2025/3/30 - 18:04
 */
@Data
public class SpaceAnalyzeRequest implements Serializable {

    /**
     * 空间 ID
     */
    private Long spaceId;

    /**
     * 是否查询公共图库
     */
    private boolean queryPublic;

    /**
     * 全空间分析
     */
    private boolean queryAll;

    private static final long serialVersionUID = 1L;
}

