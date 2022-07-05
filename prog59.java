import java.util.*;

// program Tital : give value From user in Array Count Even Number that Array that value using Helper Function
   // Date /8/12/2021/ 
   // Count Even Number  total Number in Array

   class prog59
   {
            void CountEven(int brr[])
            {
                 int i = 0, iCnt2 = 0;

                 for(i = 0; i<brr.length; i++)
                 {
                     if((brr[i] % 2) ==0)
                     {
                         iCnt2++; 
                     }
                    
                 }
                  System.out.println(" Even Number is "+iCnt2);
            }
        
        public static void main(String arg[])
        {
             Scanner sobj = new Scanner(System.in);
             int ino1  = 0, iCnt = 0;
             
             System.out.println(" Enter Number of Elelments\n");
             ino1 = sobj.nextInt();

            int  Arr[] = new  int[ino1];

            System.out.println(" Enter Number");
            for(iCnt = 0; iCnt<Arr.length; iCnt++)
            {
                 Arr[iCnt] = sobj.nextInt();
            }


            prog59 obj = new prog59();
            obj. CountEven(Arr);
       
            
        }
   }