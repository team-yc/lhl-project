package com.yc.lolshop.dao;

import com.yc.lolshop.bean.Advertises;
import com.yc.lolshop.bean.AdvertisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertisesMapper {
    long countByExample(AdvertisesExample example);

    int deleteByExample(AdvertisesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advertises record);

    int insertSelective(Advertises record);

    List<Advertises> selectByExample(AdvertisesExample example);

    Advertises selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advertises record, @Param("example") AdvertisesExample example);

    int updateByExample(@Param("record") Advertises record, @Param("example") AdvertisesExample example);

    int updateByPrimaryKeySelective(Advertises record);

    int updateByPrimaryKey(Advertises record);
}