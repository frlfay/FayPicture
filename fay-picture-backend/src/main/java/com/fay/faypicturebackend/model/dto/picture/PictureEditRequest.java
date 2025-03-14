package com.fay.faypicturebackend.model.dto.picture;

/**
 * ClassName: PictureEditRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 接受图片编辑请求参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/14 - 19:08
 */

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PictureEditRequest implements Serializable {

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

