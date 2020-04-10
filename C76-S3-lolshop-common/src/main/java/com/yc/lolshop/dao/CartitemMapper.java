package com.yc.lolshop.dao;

import com.yc.lolshop.bean.Cartitem;
import com.yc.lolshop.bean.CartitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CartitemMapper {
	
	@Select("select sum(p.price * c.count) as total "
			+ "from product as p ,cartitem as c " 
			+ "	where p.id = c.pid and c.uid = #{uid}")
	double total(int uid);
	
    long countByExample(CartitemExample example);

    int deleteByExample(CartitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cartitem record);

    int insertSelective(Cartitem record);

    List<Cartitem> selectByExample(CartitemExample example);

    Cartitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cartitem record, @Param("example") CartitemExample example);

    int updateByExample(@Param("record") Cartitem record, @Param("example") CartitemExample example);

    int updateByPrimaryKeySelective(Cartitem record);

    int updateByPrimaryKey(Cartitem record);
}