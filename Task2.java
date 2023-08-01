package org.example.Homework.HWException;


public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7};
            int d = 0;
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
    }
    //Индексация массива начинается с 0,
    // поэтому при попытке получить элемент с индексом 8 в массиве intArray
    // возникнет ArrayIndexOutOfBoundsException, а не ArithmeticException.
    //
    //Попытка деления на ноль (intArray[8] / d) вызовет ArithmeticException.
}
