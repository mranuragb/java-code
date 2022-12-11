package Arrays;


import java.util.Scanner;

public class Reverse
{
    public static void reverseArray(int[] arr, int n)
    {
        int i=0;
        int j=n-1;

        while (i<j)
        {
            int temp;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            //Collections.swap(arr[i],arr[j]);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Element ");
        Scanner scan =new Scanner(System.in);
        n= scan.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the Array ");

        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        Reverse.reverseArray(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
