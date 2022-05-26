//Accept Number from user and Display its Number Digit..
//Input : 9865.
//Output: 5
          6
          8
          9
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

    void DisplayDigit()
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
            System.out.println(iDigit);
            iNo = iNo/10;
        }
      
    }
}

class Digit1
{
    public static void main(String b[])
    {
        Number nobj = new Number();
       

        nobj.Accept();
        nobj.Display();

        nobj.DisplayDigit();
    }
}
