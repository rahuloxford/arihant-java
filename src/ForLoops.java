public class ForLoops {
    public static void main(String[] args) {

        // for loop

        // print "Hello World" 10 times

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello World!");
        }

        // print the table of a number?

        int number = 15;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }


        // print the number in reverse order

        int num = 259;
        int reverse = 0;

        while (num > 0) {
            int last_digit = num % 10;
            reverse = reverse * 10 + last_digit;
            num = num / 10;
        }

        System.out.println(reverse);


    }
}
