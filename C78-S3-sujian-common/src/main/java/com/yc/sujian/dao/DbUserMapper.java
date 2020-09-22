package com.yc.sujian.dao;

import com.yc.sujian.bean.DbUser;
import com.yc.sujian.bean.DbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbUserMapper {
    long countByExample(DbUserExample example);

    int deleteByExample(DbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbUser record);

    int insertSelective(DbUser record);

    List<DbUser> selectByExample(DbUserExample example);

    DbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbUser record, @Param("example") DbUserExample example);

    int updateByExample(@Param("record") DbUser record, @Param("example") DbUserExample example);

    int updateByPrimaryKeySelective(DbUser record);

    int updateByPrimaryKey(DbUser record);
}