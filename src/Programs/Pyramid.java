package Programs;

import java.util.Scanner;

public class Pyramid
{
    Scanner a = new Scanner(System.in);
    int x = a.nextInt();

     void P()
    {
        for(int i = 0;i<x;i++)
        {
            for(int z = 0;z<x-i-1;z++)
            {
                System.out.print(" ");
            }
            for (int b = 0;b<i+1;b++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pyramid obj = new Pyramid();
        obj.P();
    }
}
