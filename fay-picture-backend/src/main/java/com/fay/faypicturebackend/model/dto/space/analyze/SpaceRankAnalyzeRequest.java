package com.fay.faypicturebackend.model.dto.space.analyze;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SpaceRankAnalyzeRequest
 * Package: com.fay.faypicturebackend.model.dto.space.analyze
 * Description: 空间使用排行分析请求封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:52
 */
@Data
public class SpaceRankAnalyzeRequest implements Serializable {

    /**
     * 排名前 N 的空间
     */
    private Integer topN = 10;

    private static final long serialVersionUID = 1L;
}
