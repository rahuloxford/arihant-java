public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(26, 99));
        System.out.println(add(14, 79, 26));
        System.out.println(add(22, 66, 43, 20));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
