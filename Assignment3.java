//Taking Input from user

import java.util.Scanner; //Importing Scanner method for input
public class Assignment3 {
    public static void main(String[] args) {
        int id, price;
        String title, description, category;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID: ");  //Taking Input from user
        id = input.nextInt();
        input.nextLine(); //To Consume The leftover "Enter" newline55

        System.out.println("Enter Title: ");
        title = input.nextLine();

        System.out.println("Enter Description: ");
        description = input.nextLine();

        System.out.println("Enter Category: ");
        category = input.nextLine();

        System.out.println("Enter Price: ");
        price = input.nextInt();

        System.out.println("--Details--"); //Printing User Provided Data
        System.out.println("ID = "+id);
        System.out.println("Title = "+title);
        System.out.printf("Description = %s\n", description);
        System.out.printf("Category = %s\n", category);
        System.out.println("Price = "+price);
        
    }
    
}
