package com.company;

import java.util.Scanner;
/** @autor Natalya Moshkova */
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        float a,b,c;
        String operator;
        System.out.println("Введите первое число");
        a = scan.nextFloat();
        System.out.println("Выберите операцию, нажав -,+,*,/");
        operator = scan.next();
        System.out.println("Введите второе число");
        b = scan.nextFloat();

        if (operator.equals("*")){
            c = a * b;
            System.out.printf("Произведение чисел %.4f%n", c);
        }
        if (operator.equals("/")){
            c = a / b;
            System.out.printf("Деление чисел чисел %.4f%n", c);
        }
        if (operator.equals("+")){
            c = a + b;
            System.out.printf("Сумма чисел %.4f%n", c);
        }
        if (operator.equals("-")){
            c = a - b;
            System.out.printf("Разность чисел %.4f%n", c);
        }


        scan.close();

    }
}
