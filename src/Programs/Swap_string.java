package Programs;

public class Swap_string {
    public static void main(String[] args) {
        Swap_string obj = new Swap_string();
        obj.S();
    }

    void S() {
        String a = "AJAY";
        String b = "KUMAR";

        a = a + b;

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);


    }
}
