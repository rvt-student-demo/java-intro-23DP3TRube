package lv.rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    

    
Account Matthewsaccount = new Account("Matthews account ", 1000.00);
Account Myaccount = new Account("My account ", 0.00);

System.out.println("Initial state");
System.out.println(Matthewsaccount);
System.out.println(Myaccount);

Matthewsaccount.withdraw(100);
System.out.println("The balance of Matthews account is now: " + Matthewsaccount.balance());
Myaccount.deposit(100);
System.out.println("The balance of My account is now: " + Myaccount.balance());

System.out.println("End state");
System.out.println(Matthewsaccount);
System.out.println(Myaccount);

    }}