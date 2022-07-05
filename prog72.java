import java.util.*;
// program Title : Take  character From  user  And Check Small Character 
//  using ASII VAlue >0   9<
// Date /5/02/2022/ 
class prog72 
{
         Boolean CheckDigit(char ch2 )
         {
               if((ch2>='0') && (ch2<='9'))
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
          char ch1 = 0;
          Boolean iret = false;

          System.out.println(" Enter Number ");
          ch1 = sobj.next().charAt(0);
          prog72 obj = new prog72();
          iret = obj.CheckDigit(ch1);

          if(iret == true)
          {
            System.out.println(" It Is Digit \n");
          }
          else
          {
              System.out.println(" It is Not Digit\n");
          }
    }
    
}
