package Arrays;

import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args)
    {
        int n;
        int sum=0;;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Element ");
        n= scan.nextInt();

        int arr[]=new int [n];
        System.out.println("Enter the array");

        for (int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            //System.out.println(arr[i]);

            sum=sum+arr[i];
        }
        System.out.println("Sum of array is = "+sum);
    }
}
