import java.util.*;
// program Tital Check Number is CheckPallindrome or not
// Date /9/1/2022/
class prog31 
{
         boolean CheckPallindrome(int ino2 )
         {
               int iRev  = 0, iDigit = 0;
               int temp = ino2; // collect Number oringal in temp Variable 
               while(ino2 != 0) 
               {
                    iDigit = ino2 %10;
                    iRev = (iRev * 10)  + iDigit;
                    ino2 = ino2 / 10;
               }
              if(iRev == temp) // check oringal Number And collect Number ==  it Palindrome 
              {
                  return true;
              }
              else
              {
                  return false;
              }
       }
   public static void main(String arg[])
   {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0;
        boolean iret = false;

        System.out.println("Enter Number \n");
        ino1 = sobj.nextInt();

        prog31 obj = new prog31();
        iret = obj.CheckPallindrome(ino1);
        
        if (iret == true) 
        {
           System.out.println(" it is Pallindrome Number\n");
        }
        else
        {
             System.out.println(" it is Not Pallindrome\n");
        }

   }

}
