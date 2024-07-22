package Programs;

public class Armstrong
{

    void A()
    {
        int x = 151;

        int y = x;

        int sum = 0;

        while (y!=0)
        {
            int z = y%10;
            sum += (z * z * z);
            y /= 10;

        }

        if(x == sum)
        {
            System.out.println("Programs.Armstrong");
        }
        else
        {
            System.out.println("Not a Programs.Armstrong");
        }
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.A();
    }
}
