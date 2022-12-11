package Arrays;

import java.util.Scanner;

public class Mergearray
{
    public static void main(String[] args) {

        int size ;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the element ");
        size = scan.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("Enter the array 1");

        for (int i=0;i<size;i++)
        {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the Array2");
        for (int i=0;i<size;i++)
        {
            arr2[i]=scan.nextInt();
        }
        int i=0;
        int j=0;

       for (i=0;i<size;i++)
       {
           if(arr1[i]<arr2[j])
           {
                i++;
           }
           else
           {
               j++;
           }
       }

    }
}