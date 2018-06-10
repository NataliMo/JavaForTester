package com.company;

/**
 * Created by natalamoskova on 05.06.2018.
 */
public class Massive {
    public static void main(String[] args) {


    int[] massive = new int[20];
    int max=0;
    int min=0;
    int a,b;


// инциализация массива
        System.out.println("Искомый массив");
    for (int i=0; i < massive.length; i++) {
        massive[i] = (int)Math.round((Math.random()*20)-10);
        System.out.print(massive[i]+ " ");


    }

        //поиск максимального отрицательного элемента
        int l = 0;

    for (int i=0; i< massive.length; i++) {
        if (massive[i]<0) {
            max = massive[i];
            break;
        }
    }

    for (int i=0; i < massive.length; i++) {
        if (massive[i]<0 && massive[i]>max) {
            max = massive[i];
            l = i;

        }
    }
    if (max == 0)
        a = max;
    else
        a = max;

    // поиск минимального положительного элемента
        int k = 0;
        for (int i=0; i< massive.length; i++) {
            if (massive[i]>0) {
                min = massive[i];
                break;
            }
        }

        for (int i=0; i < massive.length; i++) {
            if (massive[i]>0 && massive[i]<min) {
                min = massive[i];
                k = i;

            }
        }
        if (min == 0)
            a = min;

        else
            a = min;

        int m;
        m = massive[l];
        massive[l] = massive[k];
        massive[k] = m;
        System.out.println();

        for (int i=0; i < massive.length; i++)
            System.out.print(massive[i]+ " ");

    }
}
