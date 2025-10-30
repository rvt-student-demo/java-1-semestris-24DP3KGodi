package rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheasNumbers {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter numbers. stop by entering -1:");
    while (true) {
        int number = scanner.nextInt();
        if (number == -1){
            break;
        }
        numbers.add(number);
    }

    System.out.println("From where? ");
    int start = scanner.nextInt();

    System.out.println("To where? ");
    int end = scanner.nextInt();

    System.out.println("\nNumbers in the specified range:");
    for (int i = start; i <= end; i++) {
        System.out.println(numbers.get(i));
    }

    scanner.close();
    }
}