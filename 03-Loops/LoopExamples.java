public class LoopExamples {

    public static void main(String[] args) {

        // 1. FOR LOOP - used when the number of iterations is known
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            // This will print numbers from 1 to 5
            System.out.println("Iteration " + i);
        }

        // 2. WHILE LOOP - used when the number of iterations is unknown beforehand
        System.out.println("\nUsing while loop:");
        int j = 1; // initialization
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++; // increment
        }

        // 3. DO-WHILE LOOP - always runs at least once
        System.out.println("\nUsing do-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // 4. ENHANCED FOR LOOP (for-each) - used to iterate through arrays or
        // collections
        System.out.println("\nUsing enhanced for loop:");
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // 5. BREAK statement - used to exit the loop early
        System.out.println("\nUsing break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // exits the loop when i is 6
            }
            System.out.println("i = " + i);
        }

        // 6. CONTINUE statement - skips the current iteration
        System.out.println("\nUsing continue statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips printing when i is 3
            }
            System.out.println("i = " + i);
        }
    }
}
