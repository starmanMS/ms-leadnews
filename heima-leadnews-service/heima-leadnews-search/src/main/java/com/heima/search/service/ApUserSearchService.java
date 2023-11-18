package com.heima.search.service;

import com.heima.model.common.dto.ResponseResult;
import com.heima.model.search.dtos.HistorySearchDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface ApUserSearchService {

    /**
     *  保存用户历史搜索记录
     * @param keyword
     * @param userId
     */
    public void insert(String keyword, Integer userId);

    /**
     * 查询历史记录
     * @return
     */
    public ResponseResult findUserSearch();

    /**
     * 删除历史记录
     * @param dto
     * @return
     */
    public ResponseResult delUserSearch(HistorySearchDto dto);
}
