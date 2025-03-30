package com.fay.faypicturebackend.model.vo.space.analyze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SpaceTagAnalyzeResponse
 * Package: com.fay.faypicturebackend.model.vo.space.analyze
 * Description: 空间图片标签分析响应封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceTagAnalyzeResponse implements Serializable {

    /**
     * 标签名称
     */
    private String tag;

    /**
     * 使用次数
     */
    private Long count;

    private static final long serialVersionUID = 1L;
}
