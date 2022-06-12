//write a program which display below Pattern
/*
 #  *  *  *
 #  #  *  *
 #  #  #  *
 #  #  #  # 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
    private int iRow,iCol;

    public Pattern(int a, int b)
    {
        iRow = a;
        iCol = b;
    }

    public void DisplayPattern()
    {
        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j< iCol; j++)
            {
                if(i >= j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }

            }
            System.out.print("\n");
        }
    }

}

class program6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Row Number..");
        int iRow = sobj.nextInt();

        System.out.println("Enter the Columns Number..");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern(iRow,iCol);

        obj.DisplayPattern();
    }
}