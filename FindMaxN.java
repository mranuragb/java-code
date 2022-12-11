package ScalerJava;

import java.util.Scanner;

public class FindMaxN
{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner (System.in);
        System.out.println("How much Number you give ");
        n= scan.nextInt();

        int maxValue = Integer.MIN_VALUE;

        System.out.println("Enter the Number ");
        for(int i=0;i<n;i++)
        {

            int current = scan.nextInt();

            maxValue=Math.max(maxValue,current);
        }

        System.out.println("Maximum Number is "+maxValue);

    }
}
