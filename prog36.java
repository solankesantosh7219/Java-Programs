import java .util.*;
// Date /11/1/2022
// Enter  First Number >=2 nacha gunakar 4 timing >  2*2*2*2
// Enter Second Number >=4
//  Power is >>16
// program Title : Calculte  The Power of Number

class prog36
{



  int Power(int x1 , int y1)
    {
         int iCnt = 0, imult = 1;

         for(iCnt = 1; iCnt<=y1; iCnt++)   // y mins 2  x mins 4 
         {
             imult = imult * x1;
        
        }
         return imult;
    }
     public static void main (String arg[])
     {
         Scanner sobj = new Scanner(System.in);
         int x = 0, y = 0;

         System.out.println(" Enter First Number\n");
         x = sobj.nextInt();

         System.out.println(" Enter Second Number\n");
         y = sobj.nextInt();

         prog36 obj = new prog36();

      int iret = obj.Power(x, y);

      System.out.println(" Power is ::>"+ iret);

     }
}