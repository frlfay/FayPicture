package com.fay.faypicturebackend.controller;

import com.fay.faypicturebackend.common.BaseResponse;
import com.fay.faypicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MainController
 * Package: com.fay.faypicturebackend.controller
 * Description: 健康检查
 * 健康检查是指可以通过访问该接口，来快速验证后端服务是否正常运行，所以该接口的返回值非常简单
 *
 * @Author: FLFfang
 * @Create: 2025/3/10 - 11:28
 */
@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
