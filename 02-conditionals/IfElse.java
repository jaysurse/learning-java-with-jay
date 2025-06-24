import java.util.Scanner ;
public class IfElse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check number is  \"Even\" or \"Odd\": ");
        int no = input.nextInt();

        if(no % 2 == 0){
           System.out.println(no + " is Even");
        }
        else{
            System.out.println("Number " +no +" Odd");
        }

    }
}                           