package com.task2;

public class Main {
// Написать программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе печатается
// зарплата за вычетом 13% (НДФЛ). Пример: на вход подается 70000, на выходе печатается 60900 руб.


    public static void main(String[] args) {

    double salary = 70000;
        System.out.println("Зарпата: "+salary+" рублей");
    double ndfl = 0.13;
        System.out.println("НДФЛ = "+ndfl);

        System.out.print("Зарплата на руки:");
        System.out.format("%.2f",(salary - (ndfl*salary)));
        System.out.print(" рублей");
}
}
