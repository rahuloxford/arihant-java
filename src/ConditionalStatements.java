import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print if user can vote or not??
//        System.out.print("What is your age? ");
//        int age = sc.nextInt();
//
//        if (age >= 18) {
//            System.out.println("User can vote");
//        } else {
//            System.out.println("User cannot vote");
//        }

        // print if a number is even or odd

//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }


        // if else ladder

//        if (condition) {
//            code
//        } else if (condition) {
//            code
//        } else if (condition) {
//            code
//        } else if (condition) {
//            code
//        } else if (condition) {
//            code
//        } else {
//            code
//        }


        // build a grading system.
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else if (marks >= 50) {
            System.out.println("E");
        } else {
            System.out.println("Fail");
        }


    }
}
