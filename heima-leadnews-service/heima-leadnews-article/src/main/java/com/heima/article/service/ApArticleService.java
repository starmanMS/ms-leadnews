package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.dto.ArticleDto;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.article.pojo.ApArticle;
import com.heima.model.common.dto.ResponseResult;

public interface ApArticleService extends IService<ApArticle> {

    ResponseResult load(Short loadType, ArticleHomeDto dto);

    ResponseResult saveArticle(ArticleDto dto);
}
