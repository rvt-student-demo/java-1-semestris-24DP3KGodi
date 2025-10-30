package rvt;

import java.util.Scanner;

public class MansUzdevums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int n  = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++ ) {
            sum += 1;
        }
        System.out.println("The sum is " + sum);

        scanner.close();
    }
}



    