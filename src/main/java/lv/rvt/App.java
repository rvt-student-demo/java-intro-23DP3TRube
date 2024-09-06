package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

    
        Scanner scanner = new Scanner(System.in);

        System.out.println("ievadi vardu:");
        String name = scanner.nextLine();
        
        System.out.println("ievadi uzvardu:");
        String uzvards = scanner.nextLine();

        System.out.println("ievadi grupu:");
        String grupa = scanner.nextLine();

        System.out.println("Students: "+ name + " " + uzvards + ", " + "grupa: " + grupa);
        
    }
}
