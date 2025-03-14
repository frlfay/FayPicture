package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: PictureUploadRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 接受图片上传请求参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/14 - 19:02
 */
@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
