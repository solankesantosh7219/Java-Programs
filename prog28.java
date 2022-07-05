import java.util.*; // Example 2
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Count total Number in reminder only Even Number
// Date/9/1/2022/
class prog28 
{
      int CountEven(int ino2 )
      {
           int iCnt = 0, iDigit = 0,isum =0;
           
           if(ino2 == 0)
           {
               return 1;
           }
           
           if(ino2<0)
           {
              ino2 = - ino2;  // Updator 
           }
          
           while(ino2>0)
           {
              iDigit = ino2 %10;
             if((iDigit %2) == 0)
             {
                 isum = isum + iDigit;
             }
             
               ino2 = ino2 /10;
          }
            return isum;
        }
     
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner( System.in);
         int ino1 = 0, iret = 0;

         System.out.println(" Enter Number\n ");
         ino1 = sobj.nextInt();

         prog28 obj = new prog28();
         iret = obj.CountEven(ino1);

         System.out.println(" Count is ::"+iret);
    }
}
