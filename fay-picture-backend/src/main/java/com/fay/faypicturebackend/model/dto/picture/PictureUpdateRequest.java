package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;
import java.util.List;
import java.io.Serializable;

/**
 * ClassName: PictureUpdateRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 接受图片更新请求参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/14 - 19:09
 */
@Data
public class PictureUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 图片名称
     */
    private String name;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 分类
     */
    private String category;

    /**
     * 标签
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}
