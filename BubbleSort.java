package Arrays;

import java.util.Scanner;

public class BubbleSort
{
    public static void Bubble(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        n= scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element");

        for (int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        BubbleSort.Bubble(arr,n);
        System.out.println("Sorted Array is ");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
