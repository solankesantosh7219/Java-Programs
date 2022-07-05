
import java.util.*;

class prog67 
{     
          Boolean CheckNumber(int Brr[], int ino2)
          {  
               int i = 0;
              for(i = 0; i<Brr.length; i++)
              {
                  if(Brr[i] == ino2) 
                  {
                     return true;
                  }
                  
            } 
             return false;
      }
    public static void main(String arg[]) 
    {
         Scanner sobj = new Scanner(System.in);
         int ino1 = 0, ino2 = 0,  iCnt = 0;
         Boolean iret = false;

         System.out.println(" Enter Number OF Elemnts");
         ino1 = sobj.nextInt();

         int Arr[] = new  int[ino1];

         System.out.println(" Enter Number");
         for(iCnt = 0; iCnt<Arr.length; iCnt++)
         {
             Arr[iCnt] = sobj.nextInt();
         }

          System.out.println("Enter  Search Number");
            ino2 = sobj.nextInt();
         
            prog67 obj = new prog67(); // Cerate obj 
          iret = obj.CheckNumber(Arr, ino2); // Function Call
     
          if(iret == true)
          {
              System.out.println(" Number is Here >> ");
          }
          else
          {
              System.out.println(" Number not there >>");
          }
      
    
    }
}
