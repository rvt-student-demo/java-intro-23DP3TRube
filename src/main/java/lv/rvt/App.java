package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

import lv.rvt.tools.Helper;


    class App {
        public static 
            
        
        
        ArrayList<Person> getPersonList() throws Exception 
            {BufferedReader reader = Helper.getReader("persons.csv");
        
        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);     
            int height = Integer.valueOf(parts[3]);  
            String address = parts[4];
            
            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;        
    }   }
        