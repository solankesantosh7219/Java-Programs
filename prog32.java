import java.util.*;
// program Tital Check Number is CheckPallindrome or not
// using seprate 2 Helper Function
// Date /9/1/2022/

class prog32 
{        // Function >>3
       boolean CheckPallindrome(int input ) // in input orignal Number
            { 
                int rNumber = 0;
               rNumber = Reverse(input); // check no pallindrome oringnal and Reverse number

                if (rNumber == input)  // revrse number and input number macth
                {
                    return true;     // function call  main Function (1)
                }
                else
                {
                    return false;
                }
            }
    
        int Reverse(int ino2)  // Function >>2
           {
              int iDigit = 0, iRev = 0;

               if(ino2<0)
               {
                  ino2 = - ino2;
               }
               while (ino2 != 0) 
               {
                   iDigit = ino2 % 10;
                   iRev = (iRev * 10) + iDigit;
                   ino2 = ino2 /10;
               }
           return iRev;  /// return reslut  call Checkpallindrome
     }
     public static void main (String arg[])
     {
        Scanner sobj = new Scanner(System.in);
        int ino = 0;
        boolean iret = false;

        System.out.println(" Enetr Number\n");
        ino = sobj.nextInt();

        prog32 obj = new prog32();

        iret = obj.CheckPallindrome(ino);
       
       if(iret == true) 
       {
           System.out.println(" it is Pallindrome Number\n");  
       }
       else
       {
            System.out.println(" it is Not Pallindrome Number\n");
       }
     }
}
