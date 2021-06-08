package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for students " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of Marks: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("Number of students passing exam is " + count);
    }
}
