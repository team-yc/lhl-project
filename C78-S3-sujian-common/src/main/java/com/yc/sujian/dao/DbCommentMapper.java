package com.yc.sujian.dao;

import com.yc.sujian.bean.DbComment;
import com.yc.sujian.bean.DbCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbCommentMapper {
    long countByExample(DbCommentExample example);

    int deleteByExample(DbCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbComment record);

    int insertSelective(DbComment record);

    List<DbComment> selectByExample(DbCommentExample example);

    DbComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbComment record, @Param("example") DbCommentExample example);

    int updateByExample(@Param("record") DbComment record, @Param("example") DbCommentExample example);

    int updateByPrimaryKeySelective(DbComment record);

    int updateByPrimaryKey(DbComment record);
}