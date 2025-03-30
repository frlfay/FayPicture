package com.fay.faypicturebackend.model.vo.space.analyze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SpaceSizeAnalyzeResponse
 * Package: com.fay.faypicturebackend.model.vo.space.analyze
 * Description: 空间图片大小响应封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceSizeAnalyzeResponse implements Serializable {

    /**
     * 图片大小范围
     */
    private String sizeRange;

    /**
     * 图片数量
     */
    private Long count;

    private static final long serialVersionUID = 1L;
}
