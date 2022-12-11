package ScalerJava;

import java.util.Scanner;

public class CoutDigit
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n=scan.nextInt();
        int count =0;

        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Count Digit is "+count);

    }
}
