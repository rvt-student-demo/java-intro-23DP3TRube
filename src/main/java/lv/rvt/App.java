    package lv.rvt;

    import java.util.Scanner;


    class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
            System.out.println(ollie);
            ollie.study();
            System.out.println(ollie);
        }
    }

