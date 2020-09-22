package com.yc.sujian.dao;

import com.yc.sujian.bean.DbLink;
import com.yc.sujian.bean.DbLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbLinkMapper {
    long countByExample(DbLinkExample example);

    int deleteByExample(DbLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbLink record);

    int insertSelective(DbLink record);

    List<DbLink> selectByExample(DbLinkExample example);

    DbLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbLink record, @Param("example") DbLinkExample example);

    int updateByExample(@Param("record") DbLink record, @Param("example") DbLinkExample example);

    int updateByPrimaryKeySelective(DbLink record);

    int updateByPrimaryKey(DbLink record);
}