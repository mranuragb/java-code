package Arrays;

import java.util.Scanner;

public class FindPosition
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Element ");
        int size= scan.nextInt();
        int i ;
        System.out.println("Enter the Array");

        int arr[] = new int [size];

        for( i=0;i<size;i++)
        {
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the Target ");
        int target =scan.nextInt();
        for ( i=0;i<size ;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Found "+i);
                //System.out.println(i);
                break;
            }
            else
            {
                System.out.println("Not Found ");
            }

        }
//        if(i==target)
//        {
//            System.out.println("Not Found ");
//        }
    }
}
