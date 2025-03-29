package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SearchPictureByPictureRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 以图搜图
 *
 * @Author: FLFfang
 * @Create: 2025/3/29 - 16:01
 */
@Data
public class SearchPictureByPictureRequest implements Serializable {

    /**
     * 图片 id
     */
    private Long pictureId;

    private static final long serialVersionUID = 1L;
}
