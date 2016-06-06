package com.my.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.my.project.domain.City;

@Mapper
public interface CityMapper {
    @Select("SELECT * FROM T_CITY WHERE state = #{state}")
    public City findByState(@Param("state") String state);
}
