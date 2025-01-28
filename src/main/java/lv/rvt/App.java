    package lv.rvt;

    import java.util.Scanner;


    class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
            System.out.println(ollie);
            System.out.println("Study credits " + ollie.credits());
            ollie.study();
            System.out.println("Study credits "+ ollie.credits());
        }
    }

