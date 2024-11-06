package lv.rvt;
import java.util.ArrayList;

public class Stars {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();

        
    }
    public static void printSquare(int size) {
        System.out.println();
        for (int i = 0; i < size; i++){
            printStars(size);
        }
        

    }
    public static void printRectangle(int width, int height) {
        System.out.println();
        for (int j = 0; j < height; j++){
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++){
            printStars(i);
        }
    }

    //part adv.1
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");  
        }
    }

    //part adv.2

    public static void printTrianglz(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i); 
            printStars(i);          
        }
    }

    //part adv.3

    public static void christmasTree(int height) {

        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);      
            printStars(2 * i - 1);          
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);     
            printStars(3);       
        }
    }    


}

