//Accept Number from user and Display its Number Count..
//Input : 9865.
//Output: 4.
import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Entered Number are : "+this.iNo);
        
    }

    int Count()
    {
        int iDigit = 0;
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo/10;
        }
        return iCnt;
    }
}

class Digit
{
    public static void main(String b[])
    {
        Number nobj = new Number();
        int iRet = 0,iRet1 = 0;

        nobj.Accept();
        nobj.Display();

        iRet = nobj.Count();
        System.out.println("The Number of Count's are : "+iRet);
    }
}