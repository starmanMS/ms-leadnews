package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dto.ResponseResult;
import com.heima.model.wemedia.dtos.WmMaterialDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

public interface WmMaterialService extends IService<WmMaterial> {

    /**
     * 图片上传
     * @param multipartFile
     * @return
     */
    public ResponseResult uploadPicture(MultipartFile multipartFile);

    /**
     * 素材列表查询
     * @param dto
     * @return
     */
    public ResponseResult findList(WmMaterialDto dto);

    /**
     * 根据id删除图片
     * @param id
     * @return
     */
    public ResponseResult deletePics(Integer id);

    /**
     * 取消收藏
     * @param id
     * @return
     */
    public ResponseResult cancelCollect(Integer id);

    /**
     * 收藏
     * @param id
     * @return
     */
    public ResponseResult collect(Integer id);

}