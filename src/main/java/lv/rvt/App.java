package lv.rvt;
import java.util.Scanner;

public class App {
//     public static void main(String[] args) {
//         PaymentCard card = new PaymentCard(50);
//         System.out.println(card);
//     }

//              ///part 2


//     public static void main(String[] args) {
//         PaymentCard card = new PaymentCard(50);
//         System.out.println(card);

//         card.eatAffordably();
//         System.out.println(card);

//         card.eatHeartily();
//         card.eatAffordably();
//         System.out.println(card);
        
//     }

//              // part 3

//     public static void main(String[] args) {
//         PaymentCard card = new PaymentCard(5);
//         System.out.println(card);

//         card.eatHeartily();
//         System.out.println(card);

//         card.eatHeartily();
//         System.out.println(card);
// }
    
             ///part 4
    
    // public static void main(String[] args) {
    //     PaymentCard card = new PaymentCard(10);
    //     System.out.println(card);

    //     card.addMoney(15);
    //     System.out.println(card);

    //     card.addMoney(10);
    //     System.out.println(card);

    //     card.addMoney(200);
    //     System.out.println(card);
    // }

            //// Part 5

    // public static void main(String[] args) {
    //     PaymentCard card = new PaymentCard(10);
    //     System.out.println("Paul: " + card);
        
    //     card.addMoney(-15);  
    //     System.out.println("Paul: " + card); 
    // }
    // }
    public static void main(String[] args) {

    PaymentCard paulsCard = new PaymentCard(20);
    PaymentCard mattsCard = new PaymentCard(30);


    paulsCard.eatHeartily();
    mattsCard.eatAffordably();


    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);


    paulsCard.addMoney(20);
    mattsCard.eatHeartily();

    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);

    paulsCard.eatAffordably();
    paulsCard.eatAffordably();

    mattsCard.addMoney(50);
    
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);
}

}