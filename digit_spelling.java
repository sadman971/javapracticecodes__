// Digit spelling of integers
import java.util.Scanner;
public class digit_spelling {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num;
        System.out.print("Enter an integer: (Between 0 and 9): ");
        num = input.nextInt();

        switch (num) {
            case 0:
                System.out.println( "Spelling = 'ZERO' ");
                break;

            case 1:
                System.out.println( "Spelling = 'ONE' ");
                break;

            case 2:
                System.out.println( "Spelling = 'TWO' ");
                break;
            
            case 3:
                System.out.println( "Spelling = 'THREE' ");
                break;

            case 4:
                System.out.println( "Spelling = 'FOUR' ");
                break;
            
            case 5:
                System.out.println( "Spelling = 'FIVE' ");
                break;
            
            case 6:
                System.out.println( "Spelling = 'SIX' ");
                break;
            
            case 7:
                System.out.println( "Spelling = 'SEVEN' ");
                break;
            
            case 8:
                System.out.println( "Spelling = 'EIGHT' ");
                break;

            case 9:
                System.out.println( "Spelling = 'NINE' ");
                break;
        
            default: 
                System.out.println( "Invalid Input!! ");
                break;
        }

    }
}
