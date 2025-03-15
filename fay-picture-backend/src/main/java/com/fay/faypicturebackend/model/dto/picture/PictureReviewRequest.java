package com.fay.faypicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: PictureReviewRequest
 * Package: com.fay.faypicturebackend.model.dto.picture
 * Description: 接受图片审核请求参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/15 - 15:58
 */

@Data
public class PictureReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;


    private static final long serialVersionUID = 1L;
}

