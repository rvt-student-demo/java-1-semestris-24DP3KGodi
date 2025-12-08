package rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new 
    Scanner(System.in);

        int count = 0;
        int sum = 0;
        int number;

        do  {
            System.out.print("Give a number:");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);


        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);   
    }
}
