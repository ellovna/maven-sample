package com.solvd.laba.database.jaxb;


import com.solvd.laba.database.model.CarModel;
import com.solvd.laba.database.model.ElectricCars;
import com.sun.xml.bind.v2.runtime.IllegalAnnotationException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.net.URL;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CarsJaxBReader {

    public static void main(String[] args) throws JAXBException {
        try {
            JAXBContext context = JAXBContext.newInstance(Cars.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Cars cars = (Cars) unmarshaller.unmarshal(new File("src/main/resources/cars.xml"));

            List<CarModel> carsList = cars.getCar();

            for (CarModel car : carsList) {
                System.out.println("CarId: " + car.getId());
                System.out.println("Brand: " + car.getName());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Price: " + car.getPrice());
                System.out.println("Registration Date: " + car.getDate());
                System.out.println();
            }

        }  catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}





