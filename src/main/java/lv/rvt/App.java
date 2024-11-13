package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Part 1");
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println();

// part 2
        System.out.println("Part 2");
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println();


// part 3
        System.out.println("Part 3");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break; 
            }
            statistics.addNumber(number);
        }

        System.out.println("Sum of entered numbers: " + statistics.sum());
        System.out.println();

//part 4
        System.out.println("part 4");

        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");


        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break; 
            }
            

            allNumbers.addNumber(number);
            

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }


        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
}       
}