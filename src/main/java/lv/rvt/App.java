package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end){
        while (beginning<=end) {
            if (beginning % 3 == 0 ){
                System.out.println(beginning);
            }
            beginning++;
        }
    }
}