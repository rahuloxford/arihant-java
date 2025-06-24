public class Scope {
    public static void main(String[] args) {
//        System.out.println(i); // error
        int i = 10;
        System.out.println(i);
        demo();
//        System.out.println(j); // error

        int a = 55;
        System.out.println(a);

        {
            System.out.println(a);
            int b = 42;
            System.out.println(b);
        }

//        System.out.println(b); // error

        while (true) {
            int n = 431;
            System.out.println(n);
            break;
        }

//        System.out.println(n); // error

    }

    static void demo() {
//        System.out.println(i); // error
        int j = 15;
        System.out.println(j);
    }

}
