package com.yc.sujian.dao;

import com.yc.sujian.bean.DbArticle;
import com.yc.sujian.bean.DbArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbArticleMapper {
    long countByExample(DbArticleExample example);

    int deleteByExample(DbArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbArticle record);

    int insertSelective(DbArticle record);

    List<DbArticle> selectByExample(DbArticleExample example);

    DbArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbArticle record, @Param("example") DbArticleExample example);

    int updateByExample(@Param("record") DbArticle record, @Param("example") DbArticleExample example);

    int updateByPrimaryKeySelective(DbArticle record);

    int updateByPrimaryKey(DbArticle record);
}