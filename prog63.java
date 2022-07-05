
import java.util.*;

// program Tital : give value From user in Array Check Max Number in Array using Helper Function
// Date /20/1/2022/ 
// check Max Number in Arrayy
class prog63
{ 
    void CountMax(int Brr[])
    {  int i = 0, imax = 0;
       for(i = 0; i<Brr.length; i++)
       {
        if (Brr[i] >imax)// max mde ek value ynar loop firnar second value and first value check
        { // honar value max nasl tr loop firnar 3 num ynar loop condition stop honar
           imax = Brr[i];   // 11 , 12, 13,     > max no is >30
        } 
         }
       System.out.println(" Max Number is "+imax);
    }
   public static void main(String Arg[])
   {
       Scanner sobj = new Scanner(System.in);
       int ino1 = 0, iCnt = 0;


       System.out.println(" Enter Number Of Elemnts");
       ino1 = sobj.nextInt();

       int Arr[] = new int[ino1];
       
       System.out.println(" Enter Number");
       for(iCnt = 0; iCnt< Arr.length; iCnt++)
       {
           Arr[iCnt] = sobj.nextInt();
       }
       
        prog63 obj = new prog63();
        obj.CountMax(Arr);

   }






}