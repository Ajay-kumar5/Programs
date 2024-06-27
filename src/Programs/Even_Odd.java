package Programs;

import java.util.Scanner;

public class Even_Odd
{


    void N()
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int No = num.nextInt();

        if (No % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        Even_Odd obj = new Even_Odd();
        obj.F();
    }

    void F()
    {

        for(int i = 0 ;i<100;i++)
        {
            if(i%2==0)
            {

                System.out.println("  "+i);
            }
            else if(i%2!=0)
            {

                System.out.print(i);
            }
        }
    }

}
