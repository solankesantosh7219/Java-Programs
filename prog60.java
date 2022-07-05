   import java.util.*;
   // program Tital : give value From user in Array Make Addition of Odd Number Number that Array that value using Helper Function
   // Date /20/1/2022/ 
   
   class prog60
   {
             void SumOdd(int brr[])
             {
                 int isum = 0, i = 0;

                 for(i = 0; i<brr.length; i++)
                 {
                      if((brr[i] % 2) !=0)
                      {
                          isum = isum + brr[i];
                      }
                 }
                  System.out.println(" Addition odd Number::>"+isum);
             }
        public static void main (String arg[])
        {
            Scanner sobj = new Scanner(System.in);
            int ino1 = 0, iCnt = 0;

            System.out.println(" Enter Number of Elemnets");
             ino1 = sobj.nextInt();

             int Arr[] = new int[ino1];

             System.out.println(" Enter Number");
             for(iCnt =0; iCnt<Arr.length; iCnt++)
             {
                  Arr[iCnt] = sobj.nextInt();
             }

              prog60 obj = new prog60();
              obj.SumOdd(Arr);

        }
   }
   