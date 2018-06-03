package com.company;

import java.util.Scanner;
/** @autor Natalya Moshkova */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float a,b,c;
        System.out.println("Введите первое число");
        a = scan.nextFloat();
        System.out.println("Введите второе число");
        b = scan.nextFloat();
        c = a + b;
        System.out.printf("Сумма чисел %.4f%n", c);
        float a1, b1, c1;
        System.out.println("Введите первое число");
        a1 = scan.nextFloat();
        System.out.println("Введите второе число");
        b1 = scan.nextFloat();
        c1 = a1 - b1;
        System.out.printf("Разность чисел %.4f", c1);
        scan.close();





    }
}
