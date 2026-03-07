//Checking whether a character is a vowel or consonant...

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0); 
        //Only takes first index of the inputted string

        switch (ch) {
            case 'a': 
                System.out.println("Vowel");
                break;
            
            case 'e': 
                System.out.println("Vowel");
                break;

            case 'i': 
                System.out.println("Vowel");
                break;
        
            case 'o': 
                System.out.println("Vowel");
                break;
            
            case 'u': 
                System.out.println("Vowel");
                break;
            
            default:
                System.out.println("Consonant");
                break;
    
        } 
    }
}