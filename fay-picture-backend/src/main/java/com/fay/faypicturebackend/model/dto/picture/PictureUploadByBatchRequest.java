package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

/**
 * ClassName: PictureUploadByBatchRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description:
 *
 * @Author: FLFfang
 * @Create: 2025/3/15 - 23:08
 */
@Data
public class PictureUploadByBatchRequest {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 抓取数量
     */
    private Integer count = 10;

    /**
     * 名称前缀
     */
    private String namePrefix;
}

