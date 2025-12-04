package rvt;
import java.util.Scanner;

public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }
    public double average() {
        return count == 0 ? 0 : (double) sum / count;
    }


public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

Statistics allStatistics = new Statistics();
Statistics evenNumbers = new Statistics();
Statistics oddNumbers = new Statistics();

System.out.println("Enter numbers:");

while (true) {
    int num = Integer.parseInt(scanner.nextLine());

    if (num == -1) {
        break;
    }
    allStatistics.addNumber(num);
    if (num % 2 == 0) {
        evenNumbers.addNumber(num);
    } else {
        oddNumbers.addNumber(num);
    }  
}

System.out.println("Sum:" + allStatistics.sum());
System.out.println("Sum of even numbers:" + evenNumbers.sum());
System.out.println("Sum of odd numbers:" + oddNumbers.sum());
    }
}  




    