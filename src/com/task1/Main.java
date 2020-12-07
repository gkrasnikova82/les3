package com.task1;

public class Main {
    //программу, которая считает стоимость бензина (на вход программе передается кол-во литров,
    // на выходе печатается стоимость). Пример: стоимость литра бензина 43 рубля.
    // На вход подается 50, на выходе должно быть 2150 руб.

        public static void main(String[] args) {


            double price = 42.50;
            int volum = 50;

            double money = price*volum;
            System.out.println(money);

        }
}