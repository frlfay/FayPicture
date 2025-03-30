package com.fay.faypicturebackend.model.vo.space.analyze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SpaceUserAnalyzeResponse
 * Package: com.fay.faypicturebackend.model.vo.space.analyze
 * Description: 用户上传行为响应封装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/31 - 00:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceUserAnalyzeResponse implements Serializable {

    /**
     * 时间区间
     */
    private String period;

    /**
     * 上传数量
     */
    private Long count;

    private static final long serialVersionUID = 1L;
}
