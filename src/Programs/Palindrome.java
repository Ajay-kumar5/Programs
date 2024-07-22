package Programs;

import java.util.Scanner;

public class Palindrome
{
    void P()
    {

        String r ="" ;

        Scanner a = new Scanner(System.in);
        String b = a.nextLine();

        int x = b.length();

        for(int i = x-1;i>=0;i--)
        {
             r = r + b.charAt(i);

        }

        if(r.equals(b))
        {
            System.out.println("Programs.Palindrome");
        }
        else
        {
            System.out.println("Not a Plalindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.P();
    }
}
