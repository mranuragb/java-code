package TwoDarray;

import java.util.Arrays;
import java.util.Scanner;

public class Larhestsumof2D
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the row value ");
        int r = scan.nextInt();
        System.out.println("Enter the column value ");
        int c = scan.nextInt();

        int arr[][] =new int [r][c];
        System.out.println("Enter the Element ");

        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[0].length;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            Arrays.sort(arr[i]);
            sum=sum+(arr[i].length-1);
        }
        System.out.println("Sum is = "+sum);
    }
}
