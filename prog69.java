import java.util.*;

class prog69 
{       Boolean CheckCapital(char ch2)
    {
        if((ch2>='A') && (ch2<='Z'))
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
       
          System.out.println(" Enter Character");
         
         ch1 =  sobj.next().charAt(0);
        
          prog69 obj = new prog69();
         
        iret =  obj.CheckCapital(ch1);
         
          if(iret == true) 
          {
             System.out.println(" It Is Capital Character\n");
          }
          else
          {
              System.out.println(" It is Not Chapital Character\n");
          }
  
      }
}
