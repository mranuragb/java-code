package Arrays;

public class Search
{
    public static boolean search (int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={12,32,45,6,89,90};
        int n=6;
        int key=32;

        boolean S=Search.search(arr,n,key);
        if (S)
        {
            System.out.println("It is Found ");
        }
        else
        {
            System.out.println("It is not found ");
        }

        //System.out.println("Search ="+S);
    }
}
