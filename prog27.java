import java.util.*;
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Count total Number in reminder only Even Number
// Date/9/1/2022/

class prog27 
{
       int CountEven(int ino2)
       {
           int iCnt = 0, iDigit = 0;

            if(ino2 == 0) 
            {
                return 1;
            }
        if (ino2<0) 
        {
            ino2 = - ino2;
        }
        
        while (ino2>0) 
        {
            iDigit = ino2 % 10;
            if((ino2 % 2) == 0) 
            {
                 iCnt ++;  
            }
            ino2 = ino2 /10;
        }
     return iCnt;
}
     
    public static void main (String arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int ino1 = 0,  iret = 0;

        System.out.println(" Enter Number\n");
        ino1 = Sobj.nextInt();

        prog27 obj = new prog27();
        
        iret = obj.CountEven(ino1);

        System.out.println(" Count is::"+iret);
    }
}
