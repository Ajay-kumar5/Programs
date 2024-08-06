package Programs;

import java.util.Scanner;

public class Check_vowelin_string {
    public static void main(String[] args) {
        Check_vowelin_string obj = new Check_vowelin_string();
        obj.check();
    }

    void check() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Words: ");
        String b = a.nextLine();

        int count = 0;
        int count1 = 0;

        b.toLowerCase();


        for (int i = 0; i < b.length(); i++) {
            char x = b.charAt(i);
            if (x == 'a' || x == 'i' || x == 'o' || x == 'u' || x == 'e') {
                count++;
                System.out.println("vowels = " + x);

            } else {
                count1++;
                System.out.println("not a vowels = " + x);
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
