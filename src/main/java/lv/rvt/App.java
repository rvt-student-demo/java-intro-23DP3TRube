package lv.rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        DecreasingCounter part1 = new DecreasingCounter(10);

        part1.printValue();

        part1.decrement();
        part1.printValue();

        part1.decrement();
        part1.printValue();

        System.out.println();
    

        DecreasingCounter part2 = new DecreasingCounter(2);

        part2.printValue();

        part2.decrement();
        part2.printValue();

        part2.decrement();
        part2.printValue();

        part2.decrement();
        part2.printValue();

        System.out.println();

        DecreasingCounter part3 = new DecreasingCounter(100);

        part3.printValue();

        part3.reset();
        part3.printValue();

        part3.decrement();
        part3.printValue();

        System.out.println();
        
}
                
}       