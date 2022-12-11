package forloop;

import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int couter=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(couter+++" ");
            }
            System.out.println();
        }
    }
}
