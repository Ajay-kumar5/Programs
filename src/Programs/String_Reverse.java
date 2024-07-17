package Programs;

import java.util.Scanner;

public class  String_Reverse {
    public static void main(String[] args) {

        String_Reverse obj = new String_Reverse();
        obj.Words();
    }

    void Words() {
        Scanner W = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String x = W.nextLine();

        char[] z = x.toCharArray();
        for (int i = z.length - 1; i >= 0; i--) {
            System.out.print(z[i]);
        }
    }

    void Easy() {
        String A = "Kumar Hello";

        StringBuilder B = new StringBuilder();

        B.append(A);

        B.reverse();

        System.out.println(B);
    }
}
