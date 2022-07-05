
import java.util.*;
// program Tital : Take Chracter From user and Count Charactr in String small character
// Date /25/1/2022/ 
// printf in  %s use printf the String
// using Helper Function

// Hello
// 4

// HELlo
// 2

// HELLO
// 0

class prog76 
{           int  CountSmall(String str)
         {         int i = 0, iCnt = 0;
                  char ch = 0;
         
    
            for(i = 0; i<str.length(); i++)
            {
            
                 ch = str.charAt(i); // Convert to String to character Array

            if((ch>='a')  &&  (ch<='z'))
            {   
                iCnt++;   //   character ++ 
            }      
                 ch++; //   Count++
          }
         return iCnt;
    }
    
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         String  str ;  // string initazlation 
         int ch3 = 0;
        
         System.out.println(" Enter Character \n");
         str = sobj.nextLine();  // take input in String

          prog76 obj = new prog76(); // cerate obj
        
          ch3 = obj.CountSmall(str); // Function Call
          System.out.println(ch3); 
     }
}
