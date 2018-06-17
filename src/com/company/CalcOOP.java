package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by natalamoskova on 14.06.2018.
 */
public class CalcOOP {
    public static void main(String[] args) throws IOException {
        Calculator qwer = new Calculator();
        System.out.println("Выберите действия с:  действительными числами - 1 или целыми - 2");
        Scanner scn = new Scanner(System.in);
        byte f;
        f = scn.nextByte();

        if (f == 1) {
            float w, z, x;
            String operator;
            System.out.println("Введите первое число");
            w = scn.nextFloat();
            System.out.println("Выберите операцию, нажав -,+,*,/");
            operator = scn.next();
            System.out.println("Введите второе число");
            z = scn.nextFloat();

            if (operator.equals("+")) {
                x = qwer.Summa(w, z);
                System.out.printf("Сумма чисел %.4f%n", x);

            }
            if (operator.equals("-")) {
                x = qwer.Subtract(w, z);
                System.out.printf("Разность чисел %.4f%n", x);
            }
            if (operator.equals("*")) {
                x = qwer.Multiplicat(w,z);
                System.out.printf("Произведение чисел %.4f%n", x);
            }
            if (operator.equals("/")) {
                x = qwer.Apport(w,z);
                System.out.printf("Деление чисел чисел %.4f%n", x);
            }
        }

            else {
                int k, l, m;
                String operator1;
                System.out.println("Введите первое число");
                k = scn.nextInt();
                System.out.println("Выберите операцию, нажав -,+,*,/");
                operator1 = scn.next();
                System.out.println("Введите второе число");
                l = scn.nextInt();

                if (operator1.equals("+")) {
                    m=qwer.Summa(k,l);
                    System.out.println("Сумма чисел " + m);
                }
                if (operator1.equals("-")) {
                    m=qwer.Subtract(k,l);
                    System.out.println("Разность числе " + m);
                }
                if (operator1.equals("*")){
                    m=qwer.Multiplicat(k,l);
                    System.out.println("Произведение чисел " + m);
                }
                if (operator1.equals("/")){
                    m=qwer.Apport(k,l);
                    System.out.println("Деление чисел " + m);
                }

            }

        scn.close();

    }
}

class Calculator {

    private float a;
    private float b;
    private int c;
    private int d;


    public float Summa(float sum1, float sum2) {
        a = sum1;
        b = sum2;
        float sum = sum1 + sum2;
        return sum;
    }

    public int Summa(int sum3, int sum4) {
        c = sum3;
        d = sum4;
        int sum5 = sum3 + sum4;
        return sum5;
    }

    public float Subtract(float sub1, float sub2) {
        a = sub1;
        b = sub2;
        float sub = sub1 - sub2;
        return sub;
    }

    public int Subtract(int sub3, int sub4) {
        c = sub3;
        d = sub4;
        int sub5 = sub3 - sub4;
        return sub5;

    }

    public float Multiplicat (float mul1, float mul2) {
        a = mul1;
        b = mul2;
        float mul = mul1 * mul2;
        return mul;

    }

    public int Multiplicat (int mul3, int mul4) {
        c = mul3;
        d = mul4;
        int mul5 = mul3 * mul4;
        return mul5;
    }

    public float Apport (float app1, float app2) {
        a = app1;
        b = app2;
        float app = app1 / app2;
        return app;
    }

    public int Apport (int app3, int app4) {
        c = app3;
        d = app4;
        int app5 = app3 / app4;
        return app5;
    }
}



