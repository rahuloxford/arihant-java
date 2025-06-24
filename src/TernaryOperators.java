import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        // short hand for if else

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = sc.nextInt();

        // print if the given number is even or odd?
//        if (number % 2 == 0) {
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }

        // With the use of ternary operators
        // syntax: datatype variable = (condition) ? "" : "";

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);

        System.out.print("Please enter your age? ");
        int age = sc.nextInt();

        String voter = (age >= 18) ? "Valid voter" : "Invalid voter";
        System.out.println("Person is a " + voter);
    }
}
