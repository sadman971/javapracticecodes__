//Choosing Language

import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Choose Language: \n 1 - Bangla\n 2 - Urdu\n 3 - Japanese\n 4 - Korean \n Enter Option: ");
        int digit = input.nextInt();

        switch (digit) {
            case 1: 
                System.out.println("Selected language is Bangla");
                break;
            case 2: 
                System.out.println("Selected language is Urdu");
                break;
            case 3: 
                System.out.println("Selected language is Japanese");
                break;
            case 4: 
                System.out.println("Selected language is Korean");
                break;
            default:
                System.out.println("Dafault Language Selected (\"English\")");
        }

    }
    
}
