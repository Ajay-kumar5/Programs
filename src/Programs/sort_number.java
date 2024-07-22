package Programs;

public class sort_number
{
    void S()
    {
        int[] num = {7,5,7,5,6,7,7,5,6,7};

        int temp = 0;

        for(int i = 0;i<num.length;i++)
        {
            for(int j = i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i]);
        }

    }

    public static void main(String[] args) {
        sort_number oj = new sort_number();
        oj.S();
    }
}
