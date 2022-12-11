package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Element ");
        int size= scan.nextInt();

        int arr[]=new int [size];
        System.out.println("Enter the Array ");
        int largest=0;
        for (int i=0;i<size;i++)
        {
            arr[i]= scan.nextInt();
        }
       // Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];

            }
        }
        System.out.println("Largest Element = "+largest);
       // System.out.println("Largest Element "+(size-1));

    }
}
