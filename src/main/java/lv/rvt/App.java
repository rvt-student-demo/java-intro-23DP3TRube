package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi sakumu ");
        int beginning = Integer.valueOf(scanner.nextLine());
        System.out.print("Ievadi beigas ");
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(beginning, end);
        
        scanner.close();
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }
    }
}
