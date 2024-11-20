package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>(); {

                while (true) {
                        System.out.print("Enter book title (or leave empty to finish): ");
                        String title = scanner.nextLine();
                        if (title.isEmpty()) {
                            break;
                        }
            
                        try {
                            System.out.print("Enter number of pages: ");
                            int pages = Integer.parseInt(scanner.nextLine());
            
                            System.out.print("Enter publication year: ");
                            int year = Integer.parseInt(scanner.nextLine());
            
                            books.add(new Book(pages, year, title));
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter valid numeric values for pages and year.");
                        }
                    }
            

                    System.out.print("What do you want to print (everything/name)? ");
                    String choice = scanner.nextLine().toLowerCase();
            
                    if (choice.equals("everything")) {
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    } else if (choice.equals("name")) {
                        for (Book book : books) {
                            System.out.println(book.getTitle());
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
            
                    scanner.close();
}

}}