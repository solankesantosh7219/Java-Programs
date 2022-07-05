import java .util.*;

class prog16 
{ 
      boolean CheckEven(int ino2)
        {
        
        if(( ino2 %2) == 0)
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
        int ino1 = 0;
        boolean  iret = false;

        System.out.println(" Enetr Number\n");
         ino1 = sobj.nextInt();

         prog16 obj = new prog16();
         
         iret = obj.CheckEven(ino1);

         if(iret == true)
         {
              System.out.println(" it Even Number\n");
         }
         else
         {
             System.out.println(" It is Not Even Number\n");
         }
     }    
}
