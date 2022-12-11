package forloop;

import java.util.Scanner;

public class Pattern6
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the Number ");
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("*  ");
                for(int j=1;j<=n;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //System.out.print("* ");
            System.out.println();
        }
    }
}
