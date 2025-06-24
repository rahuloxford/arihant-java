import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // Variable length argument

//        System.out.println(add(126, 564));
//        System.out.println(add(126, 564, 123));
        int result = add(126, 564, 123, 250, 345,346,2354,457,345);
        System.out.println(result);

    }

    static int add(int a, int b, int c, int ...nums) {
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        return total;
    }

//    static int add(int a, int b) {
//        return a + b;
//    }
//
//    static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

}
