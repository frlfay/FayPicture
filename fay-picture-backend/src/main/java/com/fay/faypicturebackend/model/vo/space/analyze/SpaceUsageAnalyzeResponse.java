package com.fay.faypicturebackend.model.vo.space.analyze;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SpaceUsageAnalyzeResponse
 * Package: com.fay.faypicturebackend.model.vo.space.analyze
 * Description: 空间资源使用分析请求响应类
 *
 * @Author: FLFfang
 * @Create: 2025/3/30 - 22:35
 */
@Data
public class SpaceUsageAnalyzeResponse implements Serializable {

    /**
     * 已使用大小
     */
    private Long usedSize;

    /**
     * 总大小
     */
    private Long maxSize;

    /**
     * 空间使用比例
     */
    private Double sizeUsageRatio;

    /**
     * 当前图片数量
     */
    private Long usedCount;

    /**
     * 最大图片数量
     */
    private Long maxCount;

    /**
     * 图片数量占比
     */
    private Double countUsageRatio;

    private static final long serialVersionUID = 1L;
}
