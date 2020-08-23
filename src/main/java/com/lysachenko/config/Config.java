package com.lysachenko.config;

import com.lysachenko.model.Car;
import com.lysachenko.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public User user() {
        return new User("Roma", 20);
    }

    @Bean
    public Car car(User user) {
        return new Car(user, "BMW");
    }
}
