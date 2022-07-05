import java.util.*;
// program Tital : take no From user and Display * on that Number
// using seprate  1 Helper Function
// Date /11/1/2022/

// Input :      4

// Output :    1   *   2  *  3   *  4  *

class Demo
{
    void Display(int ino2)
    {   int iCnt  = 0;

        for(iCnt = 1; iCnt<=ino2; iCnt++)
        {
             System.out.println(" * "+iCnt);
        }
        
    }
}

class prog38 
{
    public static void main (String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         int ino1 = 0;

         System.out.println(" Enter Number");
          ino1 = sobj.nextInt();

          Demo  obj = new Demo();
          obj.Display(ino1); 
    }
}
