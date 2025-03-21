package com.fay.faypicturebackend.model.dto.space;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SpaceEditRequest
 * Package: com.fay.faypicturebackend.model.dto.space
 * Description: 空间编辑请求
 *
 * @Author: FLFfang
 * @Create: 2025/3/20 - 18:04
 */
@Data
public class SpaceEditRequest implements Serializable {

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     *  空间 id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
