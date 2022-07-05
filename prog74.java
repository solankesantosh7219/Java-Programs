import java.util.*;
// program Tital : Take Chracter From user and Convert  to Capital TO Small
// Date /24/1/2022/ 

class prog74 
{     char CapitalTOSmall(char ch3 )
     {
         if ((ch3>='A') && (ch3<='Z')) 
         {
             ch3 =  (char) (ch3 + 32);
       
         }
             return ch3;
       }  
    public  static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         char ch1 = 0,  ch2 = 0;

         System.out.println(" Enter Character");
         ch1 = sobj.next().charAt(0);

         prog74 obj = new prog74();
         ch2 = obj.CapitalTOSmall(ch1);

         System.out.println(" CapitalTOSmall>>"+ch2);
         
    }

}
