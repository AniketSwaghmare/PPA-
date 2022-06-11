//write a program which Count the Factor and check wether its Number prime oR Not..

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
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

    public int CountFactor()
    {
        int iCnt = 0,Count = 0;
        for(iCnt = 0; iCnt<= (Arr.length/2); iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                Count++;
            }
        }
        return Count;
    }

    public boolean CheckPrime()
    {
        int iRet = 0;
        iRet = CountFactor();

        if(iRet == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program4
{
    public static void main(String arg[])
    {
        int iLength = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Constructor Value : ");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();

        bRet = obj.CheckPrime();

        if(bRet == true)
        {
            System.out.println("It is Prime Number..");
        }
        else
        {
            System.out.println("It is Not Prime Number..");
        }

    }
}