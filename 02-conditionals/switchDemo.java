import java.util.*;

// Renamed class to avoid using the reserved keyword 'switch'
public class switchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display available color options
        System.out.println("Choose a color:");
        System.out.println("Green");
        System.out.println("Red");
        System.out.println("Blue");

        // Read the user's input
        String button = input.nextLine();

        // Check the input using switch-case
        switch (button) {
            case "Green":
                System.out.println("You chose Green ");
                System.out.println("Meaning: Go ahead, everything is okay!");
                break;

            case "Red":
                System.out.println("You chose Red ");
                System.out.println("Warning: Stop! Something is wrong.");
                break;

            case "Blue":
                System.out.println("You chose Blue ");
                System.out.println("Calm: Keep going, but stay aware.");
                break;

            default:
                System.out.println("Invalid choice ");
                System.out.println("Please enter Green, Red, or Blue only.");
        }
    }
}
