package com.baizhi.dao;

import com.baizhi.entity.Article;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ArticleDao extends Mapper<Article> {



    List<Article>selectMyMaster(int aid);

    List<Article>selectOtherMaster(int aid);


}
