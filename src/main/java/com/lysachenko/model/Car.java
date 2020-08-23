package com.lysachenko.model;

public class Car {

    private User user;
    private String name;

    public Car(User user, String name) {
        this.user = user;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "user=" + user +
                ", name='" + name + '\'' +
                '}';
    }
}
