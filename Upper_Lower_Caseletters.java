//Determining whether a leter is Upper or Lowercase...

import java.util.Scanner;
public class Upper_Lower_Caseletters {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.print("Enter a Letter: ");
        ch = input.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        
        else if(ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");

        else
            System.out.println("Not a Letter!!");

    }
}
