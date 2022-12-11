package TwoDarray;

import java.util.Scanner;

public class JaggedfirstD
{
    public static void main(String[] args) {
        int arr[][] = new int[3][];

        Scanner scan =new Scanner(System.in);

        arr[0] = new int[3];
        arr[1] = new int [3];
        arr[2] = new int [4];

        System.out.println("Enter the Element ");

        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

}
