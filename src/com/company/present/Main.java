package com.company.present;

import java.util.Date;

/**
 * Created by natalamoskova on 08.06.2018.
 */
public class Main {
    public static void main(String[] args) {
         // составение подарка

        Candies candies1 = new Candies("Toffee", 4.6, 0.05, 1018);
        Candies candies2 = new Candies("Rafaello", 5.5, 0.10, 2831);
        Caramel caramel1 = new Caramel("Барбарис", 1.2, 0.02, 3589);
        Caramel caramel2 = new Caramel("BonPari", 1.3, 0.12, 3765);
        Chokolate chokolate1 = new Chokolate("Mars", 55.60, 50.10, 6721);
        Chokolate chokolate2 = new Chokolate("Bounty", 59.90, 54.00, 1837);
        Chokolate chokolate3 = new Chokolate("KitKat", 47.70, 15.55, 3476);
        Chokolate chokolate4 = new Chokolate("Twix", 44.20,55.12, 1176);
        Gums gum1 = new Gums("Turbo", 10.30, 5.10, 2344);
        Gums gum2 = new Gums("Orbit", 11.55, 10.77, 7443);
        Gums gum3 = new Gums("LoveIs", 12.10,6.15, 9111);
        Marmalade marm1 = new Marmalade("Haribo", 22.55, 35.55, 4522);
        Marmalade marm2 = new Marmalade("Fruittela", 25.90, 29.56, 1276);


        Testy [] sweetPresent = {candies1, candies2, caramel1, caramel2, chokolate1, chokolate2, chokolate3,
                chokolate4, gum1, gum2, gum3, marm1,marm2};

        System.out.println("В подарке содержаться cладости: " );
        for (Testy num: sweetPresent)
        System.out.print(num.getBrand() + " ");

        System.out.println("\nЦена подарка(руб): ");
        double ollPrice = 0;
        for (Testy num: sweetPresent)
            ollPrice = num.getPrice() + ollPrice;
        System.out.println(ollPrice);

        System.out.println("Вес подарка(грамм): ");
        double ollWeight = 0;
        for(Testy num: sweetPresent)
            ollWeight = num.getWeight() + ollWeight;
        System.out.println(ollWeight);


    }



}

class Testy {

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

class Candies extends Testy {

    public Candies(String brand, double price, double weight, int id) {
        super(brand, price, weight, id);
    }



}

class Caramel extends Testy {
    public Caramel(String brand, double price, double weight, int id) {
        super(brand, price, weight, id);
    }
}

class Chokolate extends Testy {


    public Chokolate(String brand, double price, double weight, int id) {
        super(brand, price, weight, id);
    }
}

class Gums extends Testy {
    public Gums(String brand, double price, double weight, int id) {
        super(brand, price, weight, id);
    }
}

class Marmalade extends Testy {
    public Marmalade(String brand, double price, double weight, int id) {
        super(brand, price, weight, id);
    }
}



