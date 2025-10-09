package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = 0;

    while (true) {
        System.out.println("Give a number: ");
        num = scanner.nextInt();

        if (num == 4) {
            System.out.println(num);
            break;
        }
        System.out.println(num);
    }

    scanner.close();
    }

}         
