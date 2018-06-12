package com.company.present.sweet;

import com.sun.corba.se.impl.orb.ParserTable;

/**
 * Created by natalamoskova on 08.06.2018.
 */
//создание класса для сладостей
public class Testy {

    private String brand;
    private double price;
    private double weight;
    private int id;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {

        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public Testy(String brand, double price, double weight, int id) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }



    @Override
    public String toString() {
        return ("Сладости: " + brand + "Вес подарка: " + weight + "Стоимость: " + price);
    }

}







