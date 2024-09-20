package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

    
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        if (number > 135) {
            System.out.println("Speeding ticket!");
           } else {System.out.println("Speeding ticket fakeo!");}
    }
}
