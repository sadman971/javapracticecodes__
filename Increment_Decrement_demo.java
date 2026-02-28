//Demonstrating the application of Increment and Decrement Operators...

public class Increment_Decrement_demo {
    
    public static void main(String[] args) {
        
        int x =30, y;

        y = ++x; // prefix increment
        System.out.println(" y = "+y + ", x = "+x); 

        y = x++; // postfix increment
        System.out.println(" y = "+y + ", x = "+x);

        y = --x; // prefix decrement
        System.out.println(" y = "+y + ", x = "+x); 

        y = x--; // postfix decrement
        System.out.println(" y = "+y + ", x = "+x);


    }
}

