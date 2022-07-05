import java.util.*; // Example 2 
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Count total Number in reminder
// Date/9/1/2022/

class prog26 
{
       int CountDigit(int ino2)
       {
           int iCnt =  0;

           if(ino2 ==  0) 
           {
                return 1;
           }
           if(ino2 <0) 
           {
               ino2 = - ino2; // Upadator
           }
       
           while (ino2>0)   // Actual logic
           {
               iCnt ++;
               ino2 = ino2 /10;
            }
        return iCnt;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, iret = 0;

        System.out.println(" Enter Number");
        ino1 = sobj.nextInt();

        prog26 obj = new prog26();
        iret = obj.CountDigit(ino1);

        System.out.println(" Count is :"+iret);
    }
}
