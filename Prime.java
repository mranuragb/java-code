package ScalerJava;

import java.util.Scanner;

public class Prime
{
    public static boolean Primeno(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number ");
        n=scan.nextInt();
        boolean found=Primeno(n);
        System.out.println(found);
    }
}
