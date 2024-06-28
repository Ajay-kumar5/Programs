package Programs;

public class Swap_int {

    public static void main(String[] args) {
        Swap_int obj = new Swap_int();
        obj.S1();
    }

    void S() {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }

    void S1() {
        int a = 10;
        int b = 20;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
        ;

        System.out.println(a);
        System.out.println(b);
    }
}
