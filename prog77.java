import java.util.*;
// program Tital : Take Chracter From user and Count Charactr in String   Count Capital character
// Date /25/1/2022/ 

class prog77 
{  
        int CountCapital (String s )
        {
             int i = 0, iCnt = 0;
             char ch = 0;

             for(i = 0; i<s.length(); i++)
             {
                 ch = s.charAt(i);  // Convert String to Character
                 
                 if((ch>='A') && (ch<='Z'))
                  {
                       iCnt++;  // character++
                  }
                   ch++;      // Count++
                
                }
           
              return  iCnt;  
        }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str;
        int iret = 0;

         System.out.println(" Enter String\n");
         str = sobj.nextLine();

         prog77 obj = new prog77();
         iret = obj.CountCapital(str);

         System.out.println("CountCapital is>> "+iret);

    }
}
