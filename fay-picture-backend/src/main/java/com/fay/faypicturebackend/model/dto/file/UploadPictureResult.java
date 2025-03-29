package com.fay.faypicturebackend.model.dto.file;

import lombok.Data;

/**
 * ClassName: UploadPictureResult
 * Package: com.fay.faypicturebackend.model.dto.file
 * Description: 用于接受图片解析信息的包装类
 *
 * @Author: FLFfang
 * @Create: 2025/3/14 - 19:16
 */
@Data
public class UploadPictureResult {

    /**
     * 图片地址
     */
    private String url;

    /**
     * 缩略图 url
     */
    private String thumbnailUrl;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 文件体积
     */
    private Long picSize;

    /**
     * 图片宽度
     */
    private int picWidth;

    /**
     * 图片高度
     */
    private int picHeight;

    /**
     * 图片宽高比
     */
    private Double picScale;

    /**
     * 图片格式
     */
    private String picFormat;

    /**
     * 图片主色调
     */
    private String picColor;

}

