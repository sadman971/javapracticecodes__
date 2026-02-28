//Do You Love Java?...

import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Do you love java? \n Y = Yes \n N = NO \n ?: ");
        ch = input.next().charAt(0);

        if ( ch == 'Y')
            System.out.println("You are a java lover!!");
        else if ( ch == 'N')
            System.out.println("You are not a java lover.");
        else
            System.out.println("Invalid response!!");
   
    }

}
