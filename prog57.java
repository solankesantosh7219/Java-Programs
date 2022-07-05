import java.util.*;
// program Tital : give value From user in Array make Addition that value   using Helper Function
   // Date /19/1/2022/ 

class prog57 
{  
        void Addition(int barr[])
        {
             int i = 0, isum = 0;

             for(i= 0; i<barr.length; i++)
             {
                 isum = isum + barr[i];
             }
            System.out.println(" Addition is ::> " +isum);
        }
    public static void main (String arg[]) 
    {
         Scanner Sobj = new Scanner(System.in);
         int ino1 = 0, iCnt = 0;

         System.out.println(" Enter Numbers\n");
         ino1 = Sobj.nextInt();

         int Arr[]  =  new  int[ino1];  // Cerate New  Array 

         System.out.println(" Enter Number of Element");
         for(iCnt = 0; iCnt<Arr.length; iCnt++)
         {
             Arr[iCnt] = Sobj.nextInt();

         }

          prog57 obj = new prog57(); // cerate obj
            obj.Addition(Arr);  // Function Call
  }
}
