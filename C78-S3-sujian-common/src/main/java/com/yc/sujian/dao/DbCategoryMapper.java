package com.yc.sujian.dao;

import com.yc.sujian.bean.DbCategory;
import com.yc.sujian.bean.DbCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbCategoryMapper {
    long countByExample(DbCategoryExample example);

    int deleteByExample(DbCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbCategory record);

    int insertSelective(DbCategory record);

    List<DbCategory> selectByExample(DbCategoryExample example);

    DbCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbCategory record, @Param("example") DbCategoryExample example);

    int updateByExample(@Param("record") DbCategory record, @Param("example") DbCategoryExample example);

    int updateByPrimaryKeySelective(DbCategory record);

    int updateByPrimaryKey(DbCategory record);
}