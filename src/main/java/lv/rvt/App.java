package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi 1. skaitli: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadi 2. skaitli: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        double div = ( (double) number2 / number1);

        int sum = (number1 + number2);
        int minus = (number1 - number2);
        int reiz = (number1 * number2);
        double dal = ((double)number2 / number1);

        System.out.println(number1 + " + " + number2 + " = "  + sum);
        System.out.println(number1 + " - " + number2 + " = "  + minus);
        System.out.println(number1 + " * " + number2 + " = "  + reiz);
        System.out.println(number1 + " / " + number2 + " = "  + dal);
        System.out.println("Videjais ir: " + div);

    }
}
