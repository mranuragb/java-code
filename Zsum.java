package TwoDarray;

import java.util.Scanner;

public class Zsum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row value ");
        int row = scan .nextInt();
        System.out.println("Enter the Column value ");
        int col = scan.nextInt();

        int arr[][] = new int [row][col];

        System.out.println("Enter the Element ");

        for(int i =0 ;i< arr.length;i++)
        {
            for(int j=0 ;j < arr[0].length;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0 || i==row-1 || i+j ==row-1)
                {
                    sum = sum + arr[i][j];
                }
            }

        }
        System.out.println("Sum is ="+sum);

    }
}
