package com.fay.faypicturebackend.model.dto.picture;

import com.fay.faypicturebackend.api.aliyunai.model.CreateOutPaintingTaskRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: CreatePictureOutPaintingTaskRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: AI扩图请求类
 *
 * @Author: FLFfang
 * @Create: 2025/3/29 - 21:59
 */
@Data
public class CreatePictureOutPaintingTaskRequest implements Serializable {

    /**
     * 图片 id
     */
    private Long pictureId;

    /**
     * 扩图参数
     */
    private CreateOutPaintingTaskRequest.Parameters parameters;

    private static final long serialVersionUID = 1L;
}
