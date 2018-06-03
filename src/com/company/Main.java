package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.lang.*;
/** @autor Natalya Moshkova */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите нужную задачу: 1 - калькулятор, 2 - строковый массив");
        byte w;
        w = scan.nextByte();

        if(w == 1) {
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


        }
        else {

            System.out.println("Введите длинну строкового массива");
            int n = scan.nextInt();
            System.out.println("введите через enter слова");
            String[] arrayString = new String[n + 1];
            for (int i = 0; i < arrayString.length; i++) {
                arrayString[i] = scan.nextLine();

            }

            int max = 1;
            for (int j = 0; j < arrayString.length; j++) {
                if (arrayString[j].length() > max) {
                    max = arrayString[j].length();
                }
            }
            System.out.println("Максимальный элемент массива: " + max);
            scan.close();
        }


    }
}
