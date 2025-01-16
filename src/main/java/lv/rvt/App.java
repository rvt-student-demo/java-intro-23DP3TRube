    package lv.rvt;

    import java.util.Scanner;


    class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Box box = new Box(2.5, 5.0, 6.0);


            System.out.println("Area: " + box.area() + " Volume: " + box.volume());
            System.out.println("Top Area: " + box.topArea());
        }
    }

