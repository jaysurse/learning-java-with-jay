// import java.util.Scanner;

class StringPractice {
    public static void main(String[] args) {
        // Pallindrome
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Name to check its pallindrome or not");
        // String str1 = sc.nextLine();
        // String rev = new StringBuilder(str1).reverse().toString();
        // if (str1.equals(rev)) {
        // System.out.println(str1 + " is a palindrome");
        // } else {
        // System.out.println(str1 + " is not a palindrome");
        // }

        // String Buffer
        StringBuffer str1 = new StringBuffer("Hello");
        str1.append(" Java");
        // str1.delete(3, 6);
        str1.replace(6, 10, "World");
        System.out.println(str1);

    }
}