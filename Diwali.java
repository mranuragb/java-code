package forloop;

public class Diwali
{
    public static void main(String[] args) {
        int row;
        int col;
        int space=1;

        for(row=1;row<=5;row++)
        {
            for (col=1;col<=5;col++)
            {
                if(col==1 || col==5 ||row==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (col==1 || col==5 || row==1 || row==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=5;col++)
            {
                if (row==1 || col==1 || row ==3 ||(row==2&&col==5))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (row==1 || col==1 || row ==3 ||(row==2&&col==5))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if(row==1&&(col==1||col==5)||(row==2&&(col==2 || col==4))||(col==3&&row>=3))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //FOR DIWALI
        System.out.println();
        for (row=1;row<=5;row++)
        {
            for (space=1;space<=5;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (row==1 || row==5 || col==2 || col==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (row==1 ||row==5 ||col==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if ((col==1||col==5)||(row==3&&col==3)||(row==4&&(col==2||col==4)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (row==1||col==1||col==5||row==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (col==1||row==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (space=1;space<=3;space++)
            {
                System.out.print(" ");
            }
            for (col=1;col<=5;col++)
            {
                if (row==1||row==5||col==3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("     ** ANURAG BAWANE AND FAMILY **");
        System.out.println();
        System.out.println("WISHES YOU AND YOUR FAMILY A VERY HAPPY AND PROSPEROUS DIWALI");
    }
}
