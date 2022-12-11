package forloop;

import java.util.Scanner;

public class Printsum
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number ");
        n= scan.nextInt();
        int i,sum=0;
        for( i=1;i<=n;i++)
        {
            sum=i+i;
        }
        System.out.println("sum ="+sum);

    }
}
