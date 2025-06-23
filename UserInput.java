import java.util.Scanner;

public class UserInput {
    public static void main (String [] args){
          Scanner input = new Scanner(System.in);//Create Scanner Object          
        
        System.out.print("Enter your Name: ");
        String name = input.nextLine();

        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        System.out.print("\nHello "+ name + " You are "+ age + " years old." );

        input.close();
        
    }
}