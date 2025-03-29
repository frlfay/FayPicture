package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: PictureEditByBatchRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 批量编辑请求
 *
 * @Author: FLFfang
 * @Create: 2025/3/29 - 17:18
 */
@Data
public class PictureEditByBatchRequest implements Serializable {

    /**
     * 图片 id 列表
     */
    private List<Long> pictureIdList;

    /**
     * 空间 id
     */
    private Long spaceId;

    /**
     * 分类
     */
    private String category;

    /**
     * 标签
     */
    private List<String> tags;

    /**
     * 命名规则
     */
    private String nameRule;

    private static final long serialVersionUID = 1L;
}
