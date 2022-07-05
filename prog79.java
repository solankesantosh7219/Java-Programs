import java.util.*;
// program Tital : Take Chracter From user and Count White Space  in String  
// Count White Space Character
// Date /25/12/2022/ 

class prog79
{       int CountSpace(String str)
        {
             int i = 0, iCnt = 0;
             char ch = 0;
          
           for(i = 0; i<str.length(); i++)
           {
                ch = str.charAt(i); // Convert String to Character Array

                if(ch ==' ')
                {
                    iCnt++;
                }
               ch++;
            } 
             return iCnt++;
         }

     public static void main(String arg[])
     {
        Scanner sobj = new Scanner(System.in);
        String str;  
        int  iret  = 0;

        System.out.println(" Enter String \n");
        str = sobj.nextLine();  // input in String

         prog79 obj = new prog79();  // Cerate obj
         iret = obj.CountSpace(str); // Function Call

        System.out.println(" CountSpace>> "+iret);

     }
}