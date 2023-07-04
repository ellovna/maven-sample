package com.solvd.laba.database.mapper;

import com.solvd.laba.database.model.CarModel;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface CarMapperJava {
    @Select("select car_id, brand as brand from Car where car_id = #{car_id}")
    CarModel selectCarById(int car_id);
}
