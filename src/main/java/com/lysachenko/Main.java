package com.lysachenko;

import com.lysachenko.config.Config;
import com.lysachenko.model.Car;
import com.lysachenko.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Config.class);

        User user = annotationConfigApplicationContext.getBean(User.class);
        System.out.println(user);

        Car car = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println(car);
    }
}
