//Accept Number from user and Display its Digit Summation..
//Input : 9865.
//Output: 28
import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : \n");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Entered Number are : "+this.iNo);
    }

    int SummationDigit()
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo/10;
        }
        return iSum;
    }
    
}

class Digit2
{
    public static void main(String b[])
    {
        Number nobj = new Number();
        int iRet = 0;
        nobj.Accept();
        nobj.Display();

        iRet = nobj.SummationDigit();
        System.out.println("The Summation of Digit is : "+iRet);
        
    }
}
