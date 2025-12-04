package rvt;
import java.util.Scanner;

public class Seconds_in_a_day {
    
public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int calulatedInput = userInput * 86400;
        
        System.out.println("" + calulatedInput); 

    }
}
}
