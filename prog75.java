 import java.util.*;
 
 class prog75 
{    char CharToggle(char ch3)
     {
         if((ch3>='A') && ( ch3<='Z'))
         {
             ch3 = (char) (ch3 +32);
         
             return ch3;
        }   
     
        else if((ch3>='a') && (ch3<='z'))
       {
           ch3 = (char) (ch3 - 32);
       }
        return ch3;
    }
    public static void main (String arg[]) 
    {
         Scanner sobj = new Scanner(System.in);
         char ch = 0, ch2 = 0;

         System.out.println(" Enter Charater");
         ch = sobj.next(). charAt(0);

         prog75 obj = new prog75();
          ch2 = obj.CharToggle(ch);

        System.out.println(" CharToggle>> "+ch2);
    }
}
