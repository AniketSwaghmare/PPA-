// Accept number from user and display its factors

// Input :      10
// Output :    1    2   5

// Input :      9
// Output :     1     3

// Input :          17
// Output :         1

// Input :          20
// Output :         1   2   4   5   10

// Input :          -20
// Output :         1     2     4       5       10


import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Values : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt< Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void DisplayFactor()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < Arr.length; iCnt++)
        {
            if((Arr.length  % iCnt)== 0)
            {
                System.out.println("Factor's Are : ");
                System.out.println(Arr[iCnt]);
            }
        }
    }
}


class program1
{

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;

        System.out.println("Enter the value for constructor.");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();

        obj.DisplayFactor();
        obj = null;
        
    }
}

