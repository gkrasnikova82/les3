package com.task3;

public class Main {


    public static void main(String[] args) {
//Написать программу, которая конвертирует секунды в часы.
// Пример: на вход подается 3600, на выходе печатается 1 час.

    int sec = 3600;
        System.out.println("Дано: " +sec+ " секунд");
    int huor;
        System.out.println("Необходимо перевести секунды в часы, в одном часе 3600 секунд");
    huor = sec/3600;
	System.out.print("Ответ: "+huor);
        System.out.println(" час");
}

}
