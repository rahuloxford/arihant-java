public class LoopsPartTwo {
    public static void main(String[] args) {

        // do while loop

        // print 1 to 10?

//        int number = 1;
//        do {
//            System.out.println(number);
//            number++;
//        } while (number <= 10);

        // print all the even nums between 1 to 100?
//        int number = 1;
//        do {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//            number++;
//        } while (number <= 100);

        //  break / continue

        // print all the numbers from 1 to 10 except 3 and 7 ?

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
//                break;
                continue;
            }
            System.out.println(i);
        }

    }
}
