package TwoDarray;

import java.util.Scanner;

public class Jagged2D
{
    public static void main(String[] args) {
        int arr[][][] =new int[3][][];

        arr[0] = new int[3][3];
        arr[1] = new int[2][2];
        arr[2] = new int[3][3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Element ");

        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
