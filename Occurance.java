package Arrays;

import java.util.Scanner;

public class Occurance
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Element ");
        int size= scan.nextInt();
        int counter = 0;
        System.out.println("Enter the Array");

        int arr[] = new int [size];

        for(int i=0;i<size;i++)
        {
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the Target ");
        int target =scan.nextInt();
        for (int i=0;i<size ;i++)
        {
            if(arr[i]==target)
            {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Occured value = "+counter);
    }
}
