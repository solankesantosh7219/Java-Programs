import java .util.*;
// take Number from user 
// program Title using modd operator we can got remindar any Number After Division
// and making Addition thise reminder
// 876543
// 8+7+6+5+4+3 = 33
// Date/8/1/2022/
class prog23
{
     int Addition(int ino2)
     {
         int isum = 0, iDigit = 0;

         while(ino2>0) 
         {
            iDigit = ino2 %10;    // ynaraya Remindrchi Addition 
            isum = isum + iDigit;  // 1 + 2 + 3 + 4 + 5 + 6  = 21
            ino2 = ino2 /10;
        }
        return isum;
    }

    public static void main(String arg[])
    {
      Scanner sobj = new Scanner (System.in);
        int ino1 = 0;
        int iret = 0;

       System.out.println(" Enter Number\n");
       ino1 =  sobj.nextInt();

       prog23  obj  = new prog23();
    
       iret = obj.Addition(ino1);

       System.out.println( iret);
   }    
}