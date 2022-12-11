package Arrays;

import java.util.Scanner;

public class SelectionSort
{
    public static void Sort(int[] arr, int n)
    {
        for (int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size");
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();

        int[] arr =new int [n];
        System.out.println("Enter the Element ");

        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        SelectionSort.Sort(arr,n);
        System.out.println("Sorted Array is ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
