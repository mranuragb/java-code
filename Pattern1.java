package forloop;

import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the element");
        n= scan.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
