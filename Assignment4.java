//Calculating Monthly Installments

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Phone Price = 1800 Euros.");
        System.out.println("Number of Installments?: ");

        int inst = input.nextInt();
        System.out.print("Your Installment Amount = "+(1800/inst) + " Euros.");

    }
    
}
