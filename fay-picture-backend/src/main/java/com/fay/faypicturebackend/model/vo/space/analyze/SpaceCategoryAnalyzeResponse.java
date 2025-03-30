package com.fay.faypicturebackend.model.vo.space.analyze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SpaceCategoryAnalyzeResponse
 * Package: com.fay.faypicturebackend.model.vo.space.analyze
 * Description: 空间图片分类分析响应封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceCategoryAnalyzeResponse implements Serializable {

    /**
     * 图片分类
     */
    private String category;

    /**
     * 图片数量
     */
    private Long count;

    /**
     * 分类图片总大小
     */
    private Long totalSize;

    private static final long serialVersionUID = 1L;
}
