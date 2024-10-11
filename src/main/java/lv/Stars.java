package lv;
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

    }

