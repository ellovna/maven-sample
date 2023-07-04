package com.solvd.laba.database.mapper;

import com.solvd.laba.database.model.CarModel;

public interface CarMapper {
    CarModel selectCarById(int car_id);

    static CarModel selectCarByBrand(String brand) {
        return null;
    }

}
