package com.yc.lolshop.dao;

import com.yc.lolshop.bean.Internet;
import com.yc.lolshop.bean.InternetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternetMapper {
    long countByExample(InternetExample example);

    int deleteByExample(InternetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Internet record);

    int insertSelective(Internet record);

    List<Internet> selectByExample(InternetExample example);

    Internet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Internet record, @Param("example") InternetExample example);

    int updateByExample(@Param("record") Internet record, @Param("example") InternetExample example);

    int updateByPrimaryKeySelective(Internet record);

    int updateByPrimaryKey(Internet record);
}