package com.heima.wemedia.controller.v1;

import com.heima.model.common.dto.ResponseResult;
import com.heima.model.wemedia.dtos.WmMaterialDto;
import com.heima.wemedia.service.WmMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/material")
public class WmMaterialController {

    @Autowired
    private WmMaterialService wmMaterialService;

    @PostMapping("/upload_picture")
    public ResponseResult uploadPicture(MultipartFile multipartFile) {
        return wmMaterialService.uploadPicture(multipartFile);
    }

    @PostMapping("/list")
    public ResponseResult findList(@RequestBody WmMaterialDto dto) {
        return wmMaterialService.findList(dto);
    }

    @GetMapping("/del_picture/{id}")
    public ResponseResult deletePics(@PathVariable Integer id) {
        return wmMaterialService.deletePics(id);
    }

    @GetMapping("/cancel_collect/{id}")
    public ResponseResult cancelCollect(@PathVariable Integer id) {
        ResponseResult result = wmMaterialService.cancelCollect(id);
        return result;
    }

    @GetMapping("/collect/{id}")
    public ResponseResult collect(@PathVariable Integer id) {
        ResponseResult result = wmMaterialService.collect(id);
        return result;
    }
}
