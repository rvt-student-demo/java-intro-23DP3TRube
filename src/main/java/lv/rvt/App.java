package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;


    class App {
        public static void main(String[] args) {
            
            ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
                juice.takeFromWarehouse(11.3);
                System.out.println(juice.getName()); 
                juice.addToWarehouse(1.0);
                System.out.println(juice);          


                System.out.println(juice.history());

}
}