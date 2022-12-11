package palindrome;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
       int digit ,rev,a,b,c,d;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        digit= scan.nextInt();

        a=digit%10;
        b=(digit/10)%10;
        c=(digit/100)%10;
        d=digit/1000;

        rev=(a*1000+b*100+c*10+d);

        if(digit == rev)
        {
            System.out.println("Is is Palindrome ");
        }
        else
        {
            System.out.println("It is not a Palindrome ");
        }
    }
}
