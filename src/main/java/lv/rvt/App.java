package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;


    class App {
        public static void main(String[] args) {
            
            ArrayList<GeometricShape> shapes = new ArrayList<>();
            
            shapes.add(new Circle(6));
            shapes.add(new Triangle(3, 88, 1));

            for(GeometricShape shape : shapes){
                shape.displayInfo();
            }


}
}