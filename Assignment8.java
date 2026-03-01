//Checking candidate eligibility...

import java.util.Scanner;

public class Canidate_chk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans_1, ans_2;

        System.out.print("As a candidate, have you completed your masters?: \n Y - Yes \n N - No \n ?: ");
        ans_1 = input.next().charAt(0);

        System.out.print("Are you fluent in English?: \n Y - Yes \n N - No \n ?: ");
        ans_2 = input.next().charAt(0);

        if ( ans_1 == 'Y' && ans_2 == 'Y')
            System.out.print("You are eligible for the job interview!!");
        else if (ans_1 == 'Y' && ans_2 == 'N' || ans_1 == 'N' && ans_2 == 'Y' || ans_1 == 'N' && ans_2 == 'N' )
            System.out.print("Sorry, you are not eligible for interview.");
        else
            System.out.print("Invalid Response!!!");
        
    } 
}
