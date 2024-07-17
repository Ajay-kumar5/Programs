package Programs;

public class star
{
    static void Rigth()
    {
        for(int i = 0; i<5;i++)
        {
            for(int z = 0;z<i;z++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    static void Left()
    {
        for(int i = 0;i<5;i++)
        {
            for(int z = 4;z>i;z--)
            {
                System.out.print(" ");
            }
            for(int x =0;x<i+1;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         Rigth();
        Left();
    }
}
