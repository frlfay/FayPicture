package com.fay.faypicturebackend.api.imagesearch.model;

import lombok.Data;

/**
 * ClassName: ImageSearchResult
 * Package: com.fay.faypicturebackend.api.imagesearch.model
 * Description: 以图搜图结果
 *
 * @Author: FLFfang
 * @Create: 2025/3/29 - 15:45
 */
@Data
public class ImageSearchResult {

    /**
     * 缩略图地址
     */
    private String thumbUrl;

    /**
     * 来源地址
     */
    private String fromUrl;
}
