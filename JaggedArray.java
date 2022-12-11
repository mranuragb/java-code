package Arrays;

public class JaggedArray
{


    public static void main(String[] args) {


            int arr[][] = new int[3][];

            arr[0] = new int[]{99,100,101};
            arr[1] = new int[]{199,200};
            arr[2] = new int[]{299,300,301,302,303};

            System.out.println("Elements of 2-D Jagged Array");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
    }

}
