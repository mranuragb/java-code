package Arrays;

import java.util.Scanner;

public class InsertionSort
{
    public static void Insertion(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0;j--)
            {
                //SHIFT
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size ");
        n=scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Element ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        InsertionSort.Insertion(arr,n);
        System.out.println("Sorted Array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
