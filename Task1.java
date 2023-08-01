package org.example.Homework.HWException;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float floatValue = getFloatFromUser();
        System.out.println("Вы ввели число: " + floatValue);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result;
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                result = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите корректное дробное число.");
            }
        }
        return result;
    }
}
