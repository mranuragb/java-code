package Arrays;

public class Copyarray
{
    public static void main(String[] args) {
        int arr1[]=new int[]{12,4,5,6,3,4};
        int arr2[]=new int [arr1.length];

        for(int i = 0; i < arr1.length; i++)
        {
            arr2[i]=arr1[i];
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
//for(int i=0;i=size-1;i<a.length;i++;j--)