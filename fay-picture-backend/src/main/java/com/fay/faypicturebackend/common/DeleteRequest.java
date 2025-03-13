package com.fay.faypicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: DeleteRequest
 * Package: com.fay.faypicturebackend.common
 * Description: 删除请求包装类，接受要删除数据的 id 作內参数
 *
 * @Author: FLFfang
 * @Create: 2025/3/10 - 11:22
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;

}
