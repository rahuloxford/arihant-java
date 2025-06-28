import java.util.Arrays;

public class LearningArrays {
    public static void main(String[] args) {
        // Arrays
        // A data structure that helps us to store multiple elements
        // of SAME type inside a single variable?

        // store 5 student rnos
//        int[] rnos = {19, 79, 28, 37, 48};
//        System.out.println(Arrays.toString(rnos));

//        for (int index = 0; index < rnos.length; index++) {
//            System.out.print(rnos[index] + " ");
//        }

//        String[] users = {"tim", "tom", "jon", "chris"};
//        System.out.println(Arrays.toString(users));

//        for (String user : users) {
//            System.out.print(user + " ");
//        }


        int[] numbers = new int[5];

        numbers[2] = 26;

        System.out.println(Arrays.toString(numbers));
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }

        String[] words = new String[3];
        words[1] = "eyes";

        System.out.println(Arrays.toString(words));

    }

}
