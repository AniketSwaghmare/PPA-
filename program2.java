

import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()                //Accept the Values Function...
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Values : ");

        for(iCnt = 1; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
    }

    public void Display()           //Display the Array Elements...
    {
        int iCnt = 0;

        System.out.println("Elements of Array are : ");
        for(iCnt = 1; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }


    public void CheckPrime()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (Arr.length/2); iCnt++)
        {
            if(Arr.length % iCnt == 0)
            {
                System.out.println("Prime Number are : ");  
               System.out.println(Arr[iCnt]);
            }
            else
            {
                System.out.println("There is No prime Number : ");
            }
        }
    }

}

class program2
{
    public static void main(String str[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
       
        System.out.println("Enter the Value for Constructor");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        obj.Display();
        
        obj.CheckPrime();

        obj = null;


    }
}