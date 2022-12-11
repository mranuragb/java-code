package Arrays;

import java.util.Scanner;

public class MethodLarge
{
    public static int getLargest(int arr[])
    {
        int largest=0;
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={12,43,6,23,19};
        int l=MethodLarge.getLargest(arr);
        System.out.println(l);

    }

}
