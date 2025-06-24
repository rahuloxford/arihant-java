public class Functions {
    public static void main(String[] args) {
//        greet("Tim", 21, "Male");
//        greet("Jon", 24, "Male");
//        greet("Martha", 28, "Female");
//        int result = addition(132, 880, 971);
//        System.out.println(result);

        String name = "Arihant";
        System.out.println(name);
        changeName(name);
        System.out.println(name);
    }

    // in java there's no pass by reference only pass by value
    static void changeName(String name) {
        name = "Rahul";
    }

    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    // define a function
    static void greet(String name, int age, String gender) {
        System.out.println(name + " is a " + age + " year old " + gender);
//        System.out.println("How are you doing?");
    }
}
