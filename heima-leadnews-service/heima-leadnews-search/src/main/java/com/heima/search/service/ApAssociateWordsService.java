package com.heima.search.service;

import com.heima.model.common.dto.ResponseResult;
import com.heima.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 联想词
     * @param userSearchDto
     * @return
     */
    public ResponseResult findAssociate(UserSearchDto userSearchDto);
}
