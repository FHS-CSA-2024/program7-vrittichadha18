//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
   public static void main(String[]args){
       Scanner myScanner = new Scanner (System.in);
       
       double schrute_Bucks = 0.0;
       System.out.println("Enter schrute-bucks: ");
       schrute_Bucks = myScanner.nextDouble();
       System.out.println();
       
       double klevins = 0.0;
       System.out.println("Enter klevins: ");
       klevins = myScanner.nextDouble();
       System.out.println();
       
       double stanley_Nickels = 0.0;
       System.out.println("Enter stanley-nickels: ");
       stanley_Nickels = myScanner.nextDouble();
       System.out.println();
       
       double decimal_Schrute_Bucks = 0.0;
       
       klevins = klevins/20.0;
       stanley_Nickels = stanley_Nickels/240.0;
       
       decimal_Schrute_Bucks = (schrute_Bucks+klevins+stanley_Nickels)+0.005;
       
       decimal_Schrute_Bucks = (int)(decimal_Schrute_Bucks*100);
       decimal_Schrute_Bucks = (double)(decimal_Schrute_Bucks/100);
       
       System.out.println("Decimal-schrute-bucks: " + "$" + decimal_Schrute_Bucks);
   }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7

Enter klevins: 
17

Enter stanley-nickels: 
9

Decimal-schrute-bucks: $7.89
*/
