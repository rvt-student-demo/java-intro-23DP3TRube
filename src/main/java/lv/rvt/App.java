package lv.rvt;
import lv.Stars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App 
    {
        
        // Third element!!

        // public static void main(String[] args) {
        //     Scanner scanner = new Scanner(System.in);
        //     ArrayList<String> wordList = new ArrayList<>();

        //     System.out.println("Ievadi vardus saraksta");
        //     System.out.println("1: ");
        //     wordList.add(scanner.nextLine());
        //     System.out.println("2: ");
        //     wordList.add(scanner.nextLine());
        //     System.out.println("3: ");
        //     wordList.add(scanner.nextLine());
        //     System.out.println("Trešais vards ir: ");
        //     System.out.println(wordList.get(2));
        // }

        //Second plus third
        
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Ievadi skaitļus atdalīti ar ,");
            String input = scanner.nextLine();
    
            String[] parts = input.split(",");
            for (String part : parts) {
                numbers.add(Integer.parseInt(part.trim()));  
            }
    
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            
            System.out.println("Sum of all numbers: " + sum);
            



    ///IndexOutOfBoundsException

    //  public static void main(String[] args) {
    //     ArrayList<String> wordList = new ArrayList<>();

    //     wordList.add("First");
    //     wordList.add("Second");

    //     System.out.println(wordList.get(333));
    // }



    //List size!!!!!!!!


    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     ArrayList<String> list = new ArrayList<>();

    //     while (true) {
    //         System.out.println("Enter a value (or type 'quit' to stop):");
    //         String input = scanner.nextLine();
            
    //         // Break the loop if the user types "quit"
    //         if (input.equalsIgnoreCase("quit")) {
    //             break;
    //         }
            
    //         // Add the input to the list
    //         list.add(input);
    //     }
        
    //     // Print the number of values in the list
    //     System.out.println("Number of values on the list: " + list.size());
    // }






    // Last in list!!!!!!!!!! 
}

    }

    
