package forloop;

import java.util.Scanner;

public class Fibbonacii
{
    public static void main(String[] args)
    {
        int num ;
        int first=-1;
        int second=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        num= scan.nextInt();

        for(int i=1;i<num;i++)
        {
            int sum=first+second;
            System.out.println(sum);

            first=second;
            second=sum;
        }
    }
}
