package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoarray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element");
        int size = scan.nextInt();
        System.out.println("Enter the array 1");
        int array1[] = new int[size];
        for (int i=0;i<size;i++)
        {
            array1[i] = scan.nextInt();
        }

        int array2[] = new int[size];
        System.out.println("Enter the array 2");
        for (int i=0 ;i<size;i++)
        {
            array2[i] = scan.nextInt();
        }
         Arrays.sort(array1);

//        System.out.println("Modified arr[] : "
//                + Arrays.toString(arr1));    }
        Arrays.sort(array2);
        System.out.println("First Array is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }

        System.out.println("Second Array is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }

        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        System.arraycopy(array1, 0, result, 0, length1);
        System.arraycopy(array2, 0, result, length1, length2);
        System.out.println("\n Merge Array is = ");
        System.out.println(Arrays.toString(result));

    }
}
