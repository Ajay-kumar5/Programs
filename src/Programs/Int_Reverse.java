package Programs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Int_Reverse
{
    void Intrev()
    {
        int[] arr = {5,4,3,2,1};

        int l = 0;
        int r = arr.length-1;

        while (l<r)
        {
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

        for(int num : arr)
        {
            System.out.print(num+" ");
        }




    }

    public static void main(String[] args) {
        Int_Reverse obj = new Int_Reverse();
        obj.Intrev();
    }
}
