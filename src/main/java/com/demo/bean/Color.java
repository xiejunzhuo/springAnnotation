package com.demo.bean;

/**
 * @author 李建成
 * @version 1.0
 * @date 2020/5/30 20:52
 */
public class Color {

    private String name;

    private Car car;

    public Color() {
        System.out.println("Color....construction");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
