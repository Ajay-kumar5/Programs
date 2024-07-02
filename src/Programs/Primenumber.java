package Programs;

import java.util.Scanner;

public class Primenumber {

    int count = 0;

    public static void main(String[] args) {
        Primenumber obj = new Primenumber();
        obj.Prime();
    }

    void Prime() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        for (int i = 2; i <= b / 2; i++) {
            if (b % i == 0) {
                count++;
            }
        }
        if (count == 0 && b != 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
}
