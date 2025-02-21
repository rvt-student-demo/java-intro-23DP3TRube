package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

import lv.rvt.tools.Helper;


    class App {
        public static void main(String[] args) throws Exception {
            
            BufferedReader reader = Helper.getReader("persons.csv");


                String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            
            System.out.println("Visas rindas ir izlasitas!");
        }
}