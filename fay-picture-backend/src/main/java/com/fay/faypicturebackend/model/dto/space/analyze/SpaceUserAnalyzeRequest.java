package com.fay.faypicturebackend.model.dto.space.analyze;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName: SpaceUserAnalyzeRequest
 * Package: com.fay.faypicturebackend.model.dto.space.analyze
 * Description: 用户上传行为请求封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SpaceUserAnalyzeRequest extends SpaceAnalyzeRequest {

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 时间维度：day / week / month
     */
    private String timeDimension;
}
