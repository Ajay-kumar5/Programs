package Programs;


import java.util.Arrays;
import java.util.HashSet;

public class Dup_count
{
        void Dup()
        {
            int[] num = {7,5,7,5,6,7,7,5,6,7};

            int visited = -1;

            Arrays.sort(num);

            for(int i = 0;i<num.length;i++)
            {
                if(num[i]!=-1)
                {
                    int c = 1;
                    for(int j = i+1;j<num.length;j++)
                    {
                        if(num[i]==num[j])
                        {
                            c++;
                            num[j]=visited;
                        }
                    }
                    if(c>1)
                    {
                        System.out.println(num[i]+" Dup count = "+c);
                    }
                }

            }

        }


        void dup2() {
            int[] num = {7, 5, 7, 5, 6, 7, 7, 5, 6, 7};

            HashSet<Integer> counted = new HashSet<>();

            int count;
            for (int i = 0; i < num.length; i++) {

                if (!counted.contains(num[i])) {
                    count = 0;
                    for (int j = 0; j < num.length; j++) {
                        if (num[i] == num[j]) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        System.out.println(num[i]
                                + " occurs " + count + " times");
                    }
                    counted.add(num[i]);
                }
            }
        }

    public static void main(String[] args) {
        Dup_count obj = new Dup_count();
        obj.dup2();
    }
}
