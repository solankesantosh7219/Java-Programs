import java.util.*;
//  program Tital : Take Chracter From user and Count Charactr in String  
//  Count Capital character and Small Character
//  Date /25/1/2022/ 
class prog78 
{       void  ConutSmallCapital(String str)
        {
             int i = 0, iCnt1 = 0, iCnt2 = 0;
             char ch = 0;
             
             for(i = 0; i<str.length(); i++)
             {
                  ch = str.charAt(i);

                  if((ch>='A') && (ch<='Z'))
                  {
                      iCnt1++;   
                  }
                   else if((ch>='a') && (ch<='z'))
                  {
                       iCnt2++;
                  }
                ch++;
            }
           System.out.println(" Capital>> "+iCnt1);
           System.out.println(" Small>> "+iCnt2);
        
        }
   public static void main(String arg[]) 
   {
       Scanner sobj = new Scanner(System.in);
        String str;
        int iret = 0;

        System.out.println(" Enter String\n");
        str = sobj.nextLine();

        prog78 obj = new prog78();
       
        obj.ConutSmallCapital(str);

   }
}
