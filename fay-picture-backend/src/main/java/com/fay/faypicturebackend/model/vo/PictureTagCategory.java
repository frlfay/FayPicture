package com.fay.faypicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: PictureTagCategory
 * Package: com.fay.faypicturebackend.model.vo
 * Description: 图片标签分类
 *
 * @Author: FLFfang
 * @Create: 2025/3/14 - 22:23
 */
@Data
public class PictureTagCategory {

    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;
}
