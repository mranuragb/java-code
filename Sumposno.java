package ScalerJava;

import java.util.Scanner;

public class Sumposno
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sum=0;
        int num;
        System.out.println("Enter the Number ");
        do {
            num= scan.nextInt();
            sum=sum+num;
        }while (num>=0);
        System.out.println("The sum is = "+sum);
    }
}
