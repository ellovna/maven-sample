package com.solvd.laba.database.mybatis;

import com.solvd.laba.database.mapper.CarMapperJava;
import com.solvd.laba.database.model.CarModel;
import com.solvd.laba.database.service.CarAccidentService;
import com.solvd.laba.database.service.CarService;
import com.solvd.laba.database.service.ElectricCarService;
import com.solvd.laba.xml.CarXmlParserRunner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisRunner {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);
    public static void main(String[] args)  {

        try (InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
             // create SQL session factory
             SqlSession session = new SqlSessionFactoryBuilder().build(stream).openSession(true)) {
            //CarModel car = session.selectOne("com.solvd.laba.database.mapper.CarMapper.selectCarById", 2);
            CarMapperJava carMapper = session.getMapper(CarMapperJava.class);
            CarModel car = carMapper.selectCarById(33);
            //System.out.println("CAR FROM DATABASE: " + car);
            LOGGER.info("CAR FROM DATABASE: " + car);

            //CarModel car2 = new CarModel("Toyota1");
            //carMapper.addCar(car2);
            //session.commit();

            //System.out.println(CarMapper.selectCarByBrand("Toyota1"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

