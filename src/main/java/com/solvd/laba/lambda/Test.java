package com.solvd.laba.lambda;

import com.solvd.laba.lambda.interfaces.ICarChecks;
import com.solvd.laba.lambda.interfaces.IPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);

    public static void main(final String[] args) throws Exception {

        //public static void main(String[] args) throws IOException, Exception {
        Car honda = new Car("Honda", "silver", 20000, "Sedan", 2022);
        Car tesla = new Car("Tesla", "white", 30000, "Sedan", 2023);
        Car bmw = new Car("BMW", "yellow", 45000, "Sedan", 2020);
        Car kia = new Car("KIA", "yellow", 10000, "SUV", 2015);
        Car mercedes = new Car("Mercedes", "red", 38000, "Sports", 2021);

        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));

        //REFLECTION
        // with reflection we can change the name of the final class
        // without changing in the main code
        Field[] carFields = honda.getClass().getDeclaredFields();

        for (Field field : carFields) {
            if (field.getName().equals("model")) {
                field.setAccessible(true);
                field.set(honda, "TOYOTA");
            }
        }
        //System.out.println("---------------------------------------------");
        logger.info("-------------------------------------------------------");

        //System.out.println(car1.getModel());
        // to print all the methods
        Method[] carMethods = honda.getClass().getDeclaredMethods();

        for (Method method : carMethods) {
            if (method.getName().equals("getColor")) {
                method.invoke(tesla);
                honda.getColor();

                //System.out.println(method.getName());
                logger.info(method.getName());


                //System.out.println("---------------------------------------------");
                logger.info("-------------------------------------------------------");

                ArrayList<Car> cars = new ArrayList<>();
                cars.add(honda);
                cars.add(tesla);
                cars.add(bmw);
                cars.add(kia);
                cars.add(mercedes);


                CarInfo info = new CarInfo();
                //info.testCars(cars, new checkPrice());
                //System.out.println("---------------------------------------------");
                //info.testCars(cars, new CarChecks() {
                // object of anonymous class, used only once
                //    @Override
                //    public boolean check(Car c) {
                //        return c.averagePrice<30000;
                //    }
                //});
                info.testCars(cars, (Car c) -> {
                    return c.manufactureDate > 2020;
                }); // lambda
                // System.out.println("---------------------------------------------");
                logger.info("----------------------------------------------------------");
                // parameter is student, the anonymous class was replaced by lambda
                info.testCars(cars, (Car c) -> {
                    return c.averagePrice < 30000;
                }); //lambda
                //System.out.println("---------------------------------------------");
                logger.info("-------------------------------------------------------");
                ICarChecks cc = (Car c) -> {
                    return c.averagePrice > 40000;
                };
                info.testCars(cars, cc);
                //System.out.println("---------------------------------------------");
                logger.info("-------------------------------------------------------");
                IPrinter printer = new IPrinter() {
                    @Override
                    public void print(String msg) {
                        logger.info(msg);
                        //System.out.println(msg);
                    }
                };
                printer.print("Not Lambda");
                IPrinter lambdaPrinter = m -> {
                    logger.info(m);
                };
                //System.out.println(m);
                lambdaPrinter.print("It's lambda");
                System.out.println("---------------------------------------------");

                Map<String, IPrinter> printerHub = new HashMap<>();
                printerHub.put("lambda", lambdaPrinter);
                printerHub.put(
                        "second",
                        m -> {
                            //System.out.println("Trying to understand here!");
                            //System.out.println(m);
                            logger.info("Trying to print with logger");
                            logger.info(m);
                        });
                printerHub.get("second").print("hi!");
                //System.out.println(printerHub);
                logger.info(printerHub);


                List<String> names = Arrays.asList("Honda", "Tesla", "Mercedes");
                //List<String> filteredNames = new ArrayList<>();
                //for (String name : names) {
                //if (name.startsWith("M")) { // filtering, not lambda
                //filteredNames.add(name);
                //}
                //}
                //filteredNames.sort(String::compareToIgnoreCase);
                //System.out.println(filteredNames);
                //System.out.println("---------------------------------------------");
                logger.info("-------------------------------------------------------");
                // Stream is a possibility to work with Collections
                // Intermediate (non-terminal) operations
                //names.stream().forEach(n -> System.out.println(n)); // lambda, the same as a code above
                //names.stream().filter(n -> n.startsWith("M")).forEach(n -> System.out.println(n)); // filtering
                List<String> filteredNames =
                        names
                                .stream()
                                .filter(n -> n.startsWith("M")).sorted(String::compareToIgnoreCase)
                                .collect(Collectors.toList());
                //System.out.println(filteredNames);
                logger.debug(filteredNames);


                // Integer Stream
                IntStream
                        .range(1, 10)
                        .skip(2)
                        .forEach(logger::info);
                                //System.out.println(x));
                logger.always();

                //System.out.println();


                // Stream.of sorted and findFirst, non-terminal
                Stream.of("Tesla", "Mercedes", "Honda", "Kia")
                        .sorted()
                        .findFirst()
                        .ifPresent(System.out::println);

                // terminal
                IntSummaryStatistics summary = IntStream.of(3, 9, 1, 99, 35)
                        .summaryStatistics();
                //System.out.println(summary);
                logger.info(summary);

            }
        }
    }
}




//info.printCarDate(cars, 2023);
//System.out.println("---------------------------------------------");
//info.printCarPrice(cars, 35000);
