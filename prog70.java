import java.util.*;

class prog70 
{     Boolean CheckCapital(char ch2)
    {
        if((ch2>=65)  && (ch2<=90))
        {
             return true;
        }
        else
        {
            return false;
        }
    }
        
    public static void main (String arg[])
    {
         Scanner sobj = new Scanner(System.in);
          char ch1 = 0;
          Boolean iret = false;

          System.out.println(" Enter Character\n");
          ch1 = sobj.next().charAt(0); 
          
          prog70 obj =  new prog70();
          iret = obj.CheckCapital(ch1);
          
          if (iret == true)
          {
             System.out.println(" It is Capital Character\n"); 
          }
          else
          {
               System.out.println(" It is Not Capital Character\n");
          }
  }       
}
