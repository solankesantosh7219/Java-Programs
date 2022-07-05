import java.util.*;

// program Tital : give value From user in Array Count >10   <20 Number that Array that value using Helper Function
// Date /8/12/2021/ 
// Count number 10>  <20  total Number in Array

class prog62
{           void CountRange(int Brr[])
            {
                 int i = 0, iCnt = 0;
                 for(i = 0; i<Brr.length; i++)
                 {
                     if((Brr[i]>10) && (Brr[i]<20))
                     {
                         iCnt++;
                     }
                 }
             System.out.println(" Gerter Than Number is ::>"+iCnt);
            
        }

    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
         int ino1 = 0, iCnt = 0;

         System.out.println(" Enter Number of Elements");
         ino1 = sobj.nextInt();

        int Arr[] = new int[ino1];
        
        System.out.println(" Enter Number");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
           Arr[iCnt] = sobj.nextInt();
        }

        prog62 obj = new prog62();
         obj.CountRange(Arr);
    }
}
   