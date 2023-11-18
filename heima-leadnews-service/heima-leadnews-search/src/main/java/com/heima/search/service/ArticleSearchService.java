package com.heima.search.service;

import com.heima.model.common.dto.ResponseResult;
import com.heima.model.search.dtos.UserSearchDto;

import java.io.IOException;

public interface ArticleSearchService {

    /**
     * ES文章分页搜索
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto) throws IOException;

}
