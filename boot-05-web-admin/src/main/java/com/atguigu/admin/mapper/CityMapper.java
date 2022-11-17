package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * CityMapper
 *
 * @author fj
 * @date 2022/9/25 14:24
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where id=#{id}}")
    public City getById(Long id);
}
