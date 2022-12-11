package Arrays;

import java.util.Scanner;

public class MAXMIN
{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size ");
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if (arr[i]<min)
            {
                min=arr[i];
            }
            else
            {
                System.out.println("Answer is here : ");
            }
        }
        System.out.println("Maximum value is "+max);
        System.out.println("Minimum value is "+min);
    }
}
