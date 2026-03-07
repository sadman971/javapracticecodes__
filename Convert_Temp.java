/* Converting Celcius to Farenheight...
    The Code for the opposite action is commented below.. */

import java.util.Scanner;
public class Convert_Temp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temp_C, temp_F;

        System.out.print("Enter Temperature in Celcius: " );
        temp_C = input.nextDouble();

        temp_F = ((9 * temp_C ) / 5 ) + 32;
        System.out.print("Temperature in Farenheight: "+temp_F);

    }

}

/*

// Converting Farenheight to Celcius...

import java.util.Scanner;
public class Convert_Temp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temp_C, temp_F;

        System.out.print("Enter Temperature in Farenheigh: " );
        temp_F = input.nextDouble();

        temp_C = ( (temp_F -32) / 9 ) * 5;
        System.out.print("Temperature in Celcius: "+temp_C);

    }

}

*/
