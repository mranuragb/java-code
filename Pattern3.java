package forloop;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number ");
        n=scan.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
