package lv.rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int burtuskaits = 0; 
        String garakais = "";
        int gadi = 0;
        int sakits = 0;

        while (true) {
            String ievade = reader.nextLine();
            if (ievade.isEmpty()) {
                break;
            }

            String[] dalas = ievade.split(",");
            gadi += Integer.parseInt(dalas[1]);
            sakits++;

            int lengthOfTheWord = dalas[0].length();

            if (lengthOfTheWord > burtuskaits) {
                burtuskaits = lengthOfTheWord;
                garakais = dalas[0];
            }
        }

        // Calculate the average after the loop ends
        if (sakits > 0) {
            double videjais = (double)gadi / sakits;
            System.out.println("Garakais vards: " + garakais);
            System.out.println("Videjais dzimšanas gads: " + videjais);
        }
    }
}
