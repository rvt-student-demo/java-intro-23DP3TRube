package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

    
        Scanner scanner = new Scanner(System.in);

        int summa = 0;
        System.out.println("Pedejais skaitlis?: ");
        int ievade = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= ievade; i++) {
            summa += i;
        }

        System.out.println("Summa ir " + summa);
}
}