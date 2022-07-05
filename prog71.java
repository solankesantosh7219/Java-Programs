import java.util.*;

class prog71 
{     Boolean CheckSmall(char ch2)
    {
         if((ch2>='a') && (ch2<='z'))
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
        Scanner sobj =  new Scanner (System.in);
        char ch1 = 0; 
        Boolean  iret = false;


        System.out.println(" Enter Character \n");
        ch1 =  sobj.next().charAt(0);

        prog71 obj =  new  prog71();
        iret = obj.CheckSmall(ch1);
        if(iret == true ) 
        {
            System.out.println(" It is Small Character\n");
        }
        else
        {
             System.out.println(" It IS Not Samll Character\n");
        }
     }
}
