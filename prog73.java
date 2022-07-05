import java.util.*;
// program Title:: Take small Character From user and Convert That 
// Character Small to Capital
// Date/24/1/2022/
class prog73
{      
         char SmallTOCapital(char ch3)
         {
              if((ch3>='a') && (ch3<='z'))
              {
                    ch3 = (char) (ch3 - 32);  
              }
            return ch3;
         }

    public static void main (String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         char ch1 = 0; 
         char ch2 = 0;

         System.out.println(" Enter Character\n");
         ch1 = sobj.next().charAt(0);
         
         prog73 obj = new prog73();
         ch2 = obj.SmallTOCapital(ch1);

         System.out.println(" SmallTOCapital >>"+ch2);
    }
}
