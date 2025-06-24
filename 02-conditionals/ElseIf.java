import java.util.*;
public class ElseIf{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Numers to Compare: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 == num2){
            System.out.println("Numbers are Equal");
        }
        else if(num1 > num2){
            System.out.println(num1 + " is greater");
        }
        else {
            System.out.println(num2 + " is greater");
        }
    }
}