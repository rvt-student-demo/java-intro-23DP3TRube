package lv.rvt;

import java.util.Scanner;

import javax.swing.Box;

    public class App {
        public static void main ( String[] args )
  {
    Scanner scanner = new Scanner
     Box box = new Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

     System.out.println( "length: " + box.length + " height: " + box.height +"width:  " + box.width )  ;

  }
    }
