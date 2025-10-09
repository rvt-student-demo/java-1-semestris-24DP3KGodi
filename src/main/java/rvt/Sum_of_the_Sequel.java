package rvt;

import java.util.Scanner;

public class Sum_of_the_Sequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstnum = scanner.nextInt();

        System.out.println("Last number?");
        int lastnum = scanner.nextInt();

        int sum = 0;

        for (int i = firstnum; i <= lastnum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
