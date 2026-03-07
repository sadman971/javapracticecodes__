//Demonstration of conditonal operator...

import java.util.Scanner;
public class Conditional_Operator_demo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();

        int large = (num_1 > num_2) ? num_1 : num_2; 
        //Finding the greater number with Conditional Operator (aka Ternary Operator)
        
        System.out.println("The greater number is: "+large);
    }
}
