package rvt;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int a = scanner.nextInt();

        System.out.print("Give the second number: ");
        int b = scanner.nextInt();

        System.out.print("Give the third number: ");
        int c = scanner.nextInt();

        double average = (a + b + c) / 3.0;

        System.out.println("The average is " + average);
        scanner.close();
    }
}
