package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

    
        Scanner scanner = new Scanner(System.in);

        int nums = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give the number 0 to end: ");

            int number = Integer.valueOf(scanner.nextLine());
        
            if (number != 0) {
                sum = sum + number;
                nums =  nums + 1;
                continue;
            }
            break;
        }
        System.out.println("The ammount of number: " + nums);
        System.out.println("The total sum: " + sum);
}
}