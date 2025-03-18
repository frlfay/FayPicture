package com.fay.faypicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fay.faypicturebackend.model.dto.picture.PictureQueryRequest;
import com.fay.faypicturebackend.model.dto.picture.PictureReviewRequest;
import com.fay.faypicturebackend.model.dto.picture.PictureUploadByBatchRequest;
import com.fay.faypicturebackend.model.dto.picture.PictureUploadRequest;
import com.fay.faypicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fay.faypicturebackend.model.entity.User;
import com.fay.faypicturebackend.model.enums.PictureReviewStatusEnum;
import com.fay.faypicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author FLFfang
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-03-14 18:58:41
 */
public interface PictureService extends IService<Picture> {

    /**
     * 校验图片
     *
     * @param picture
     */
    void validPicture(Picture picture);

    /**
     * 上传图片
     *
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);

    /**
     * 获取查询对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 分页获取图片包装类（单条）
     *
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片包装类（分页）
     *
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 补充审核参数
     *
     * @param picture
     * @param loginUser
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

    /**
     * 清理图片文件
     *
     * @param oldPicture
     */
    void clearPictureFile(Picture oldPicture);
}


