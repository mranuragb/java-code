package TwoDarray;

import java.util.Scanner;

public class firstproblem
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row value ");
        int row =scan.nextInt();
        System.out.println("Enter the column value ");
        int col = scan.nextInt();

        int arr[][] =new int [row][col];
        System.out.println("Enter the Array ");

        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array is ");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
