//Checking whether a number is even or odd...

import java.util.Scanner;
public class Even_Odd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a positive Integer: ");
        num = input.nextInt();

        if ( num % 2 == 0)
            System.out.println("The number is even!");
        else 
            System.out.println("The number is odd!");
        
    }
    
}
