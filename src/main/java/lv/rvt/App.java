package lv.rvt;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            int burtuskaits = 0; 
            String garakais = new String();
            int gadi = 0;
            int sakits = 0;

while (true) {
    
    String ievade = reader.nextLine();
    if (reader.equals("")) {
        break;
    }

    String[] dalas = ievade.split(",");
    gadi = gadi + Integer.valueOf(dalas[1]);
    sakits = sakits + 1;


    int lengthOfTheWord = dalas[0].length();

    if( burtuskaits <= lengthOfTheWord){

        burtuskaits = lengthOfTheWord;

}
    if(dalas[0].length() == burtuskaits){

        garakais = dalas[0];
    
    }
    
    gadi = gadi + Integer.valueOf(dalas[1]);
    
    sakits = sakits + 1;
    
    if(sakits > 0){
    
    double videjais = (1.0*gadi/sakits);


    
    
    
    System.out.println("Garakais vards: " + garakais);
    
    System.out.println("Videjais dzimšanas gads: " + videjais);
    
    }

}}}

    
