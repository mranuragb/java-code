package forloop;

import java.util.Scanner;

public class Countpencil
{
    public static void main(String[] args)
    {
        int std,pencil = 1;
        System.out.println("Enter the standard");
        Scanner scan=new Scanner(System.in);
        std= scan.nextInt();

        for(int i=1;i<=std;i++)
        {
            pencil=(i*5)-1;

        }
        System.out.println("pencil is "+pencil);
    }
}
