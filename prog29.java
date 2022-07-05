import java.util.*;
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Count total Number in reminder only Even Number
// Date/9/1/2022/
class prog29 
{
     int Reverse(int ino2)
     {
          int iDigit = 0, iRev = 0;
          if(ino2 <0) 
          {
             ino2 = - ino2;     
          }
         while(ino2>0)
         {
            iDigit = ino2 %10;
            iRev = (iRev * 10) + iDigit;
            ino2 = ino2 / 10;
         }    
         return iRev;
     }
    
   public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         int ino1 = 0, iret = 0;

         System.out.println(" Enter Number\n");
         ino1 = sobj.nextInt();

         prog29 obj = new prog29();
         iret = obj.Reverse(ino1);

         System.out.println(" Revrse no :::"+iret);
    }
    

    
}
