public class Shadowing {
    static int i = 90;

    public static void main(String[] args) {
        System.out.println(i);
        demo1();
        demo2();
    }

    static void demo1() {
        i = 33;
        System.out.println(i);
    }

    static void demo2() {
        System.out.println(i);
    }

}
