package Programs;

import java.util.Scanner;

public class Wordreverse {

    public static void main(String[] args) {
        Wordreverse obj = new Wordreverse();
        obj.R();
    }

    void R() {
        String x = "";
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Words: ");
        String b = a.nextLine();

        for (int i = b.length() - 1; i >= 0; i--) {
            x = x + b.charAt(i);
        }
        System.out.println(x);
    }

    void s() {
        String x = "Hollo! Welcome to JAVA";

        String[] R = x.split(" ");

        for (int i = R.length - 1; i >= 0; i--) {
            System.out.print(R[i]);
        }


    }
}

