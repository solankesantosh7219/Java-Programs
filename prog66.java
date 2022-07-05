import java.util.*;
 // program Tital : give value From user in Array Check  Number checkNumber is there or not Array using Helper Function
   // Date /22/1/2022/ 
   // check  Number is there or not  in Arrayy

class prog66 
{        
            Boolean CheckNumber(int Brr[], int ino2)
            {   int i = 0; 

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
         Scanner Sobj = new Scanner(System.in);
         int ino1  = 0, iCnt = 0, ino2 = 0;
         Boolean iret = false;

         System.out.println(" Enter Number OF Elemnts");
         ino1 = Sobj.nextInt();

        int Arr[] = new int[ino1];

        System.out.println(" Enter Number");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
             Arr[iCnt] = Sobj.nextInt();
        }
       
         System.out.println(" Enter Serach Number");
          ino2 = Sobj.nextInt();

       prog66 obj = new prog66();
       iret = obj.CheckNumber(Arr,ino2);
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
