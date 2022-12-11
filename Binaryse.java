package ScalerJava;

import java.util.Scanner;

public class Binaryse
{
    public static boolean BinarySea(int arr[],int n,int target)
    {
        int s=0;
        int e=n-1;

        while (s<e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            if(target>mid)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid=(s+e)/2;
        }

        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size ");
        n= scan.nextInt();
        System.out.println("Enter the Element ");
        int arr[] =new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the Target ");
        int target =scan.nextInt();

        boolean found=BinarySea(arr,n,target);

        System.out.println("It is "+found);


    }
}
