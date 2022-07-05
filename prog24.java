 import java.util.*; // Example 2 
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// and making Addition thise reminder
// Date/7/1/2022/
 
 class prog24 
{   int Addition(int ino2)
    {
         int iCnt = 0;
         int   iDigit = 0;
         while(ino2>0) 
         {                       // yanaraya Remindrchi + krane 
            iDigit = ino2 %10;  // iCnt = iCnt + 1;  As pn cintax use kru Sakta
            iCnt++;            // 1 + 2 + 3 + 4 + 5 + 6  = 21
            ino2 = ino2 /10;
         }
        return  iCnt;
    }
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);
      int ino1 = 0, iret = 0;

       System.out.println(" Enter Number");
        ino1 = sobj.nextInt();

        prog23 obj = new prog23();

        iret = obj.Addition(ino1);
        System.out.println(iret);
    }
    
}
