import java.util.*;
// program Tital : give value From user in Array Check Max Number in Array using Helper Function
// Date /22/1/2022/ 
// check Min Number in Arrayy

public class prog64 
{
      void MinCount(int Brr[])
      {
           int i = 0;
           
           int iMin = Brr[0];

           for(i = 0; i<Brr.length; i++)
           {
            if (Brr[i] <iMin)// 4   min mde ek value ynar loop firnar second value and first value check
            { 
                // honar value min nasl tr loop firnar 3 num ynar loop condition stop honar
               iMin = Brr[i];   // 11 , 12, 13,     min<less than  no is >11
            } 
            }
           System.out.println(" Min Number iS "+iMin);
        }
    public static void main(String arg[])
    {
          Scanner Sobj = new Scanner(System.in);
          int ino1 = 0, iCnt = 0;

          System.out.println(" Enter Number of Elemnts");
          ino1 = Sobj.nextInt();

          int Arr[] = new int[ino1];
          System.out.println(" Enter Number");
          for(iCnt = 0; iCnt<Arr.length; iCnt++)
          {
             Arr[iCnt] = Sobj.nextInt();
          }
         prog64 obj = new prog64();
         obj. MinCount(Arr);
          
       
          
   } 
}
