//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
   public static void main(String[]args){
       Scanner myScanner = new Scanner (System.in);
       
       double schruteBucks = 0.0;
       System.out.println("Enter schrute-bucks: ");
       schruteBucks = myScanner.nextDouble();
       System.out.println();
       
       double klevins = 0.0;
       System.out.println("Enter klevins: ");
       klevins = myScanner.nextDouble();
       System.out.println();
       
       double stanleyNickels = 0.0;
       System.out.println("Enter stanley-nickels: ");
       stanleyNickels = myScanner.nextDouble();
       System.out.println();
       
       double decimalSchruteBucks = 0.0;
       
       klevins = klevins/20.0;
       stanleyNickels = stanleyNickels/240.0;
       
       decimalSchruteBucks = (schruteBucks+klevins+stanleyNickels)+0.005;
       
       decimalSchruteBucks = (int)(decimalSchruteBucks*100);
       decimalSchruteBucks = (double)(decimalSchruteBucks/100);
       
       System.out.println("Decimal-schrute-bucks: " + decimalSchruteBucks);
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

Decimal-schrute-bucks: 7.89
*/
