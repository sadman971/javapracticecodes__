//Printing the area of a circle and a triangle
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double base, height, radius, areac, areat;
        Scanner input = new Scanner(System.in);

        System.out.println("Triangle: ");
        
        System.out.print("Enter Base: ");
        base = input.nextDouble();
        
        System.out.print("Enter Height: ");
        height = input.nextDouble();

        areat = 0.5 * base * height;

        System.out.println("The are of the triangle is: "+areat + " sq. units");

        System.out.println("Circle: ");

        System.out.print("Enter Radius: ");
        radius = input.nextDouble();

        areac= 3.1416 * radius * radius;

        System.out.println("The are of the circle is: "+areac + " sq. units");

    }
}
