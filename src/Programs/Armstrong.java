package Programs;

public class Armstrong
{
   /* An Armstrong number is a number that is equal to the
    sum of its own digits each raised to the power of the number of digits.
    For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.*/

    void A()
    {
        int x = 153;

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
