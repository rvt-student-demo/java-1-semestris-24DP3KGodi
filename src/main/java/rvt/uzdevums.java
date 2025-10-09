package rvt;

import java.util.Scanner;

public class uzdevums {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 0;
    while (number < 5) {
        System.out.println(number);
        number += 1 ;
    }
    
    System.out.println(number);
        scanner.close();
    }

}
