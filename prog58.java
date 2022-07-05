import java.util.*;

// program Tital : give value From user in Array Calculte Avarage that value using Helper Function
   // Date /19/1/2022/ 
   // calculte Avarage  total Number in Array
   
public class prog58 
{
           float Avarage(int Brr[])
           {
               int i = 0, isum = 0;
               float freslut = 0;
               
               for(i = 0; i<Brr.length; i++)  // jyvde number ahe bhagkar krane 
               {                              // ex prog 43  isum = value1 + value2 + value3; // Addition 
                  isum = isum + Brr[i];       // fReslut = isum /3;  / lenght 
               }

               freslut = isum / Brr.length ;

                return freslut;
           }
     public static void main(String arg[])
     {
           Scanner Sobj = new Scanner(System.in);
           int  ino1 = 0;
           float iret = 0;
             int iCnt = 0;
          
           System.out.println(" Enter Number of Element");
           ino1 = Sobj.nextInt();

           int Arr[] = new  int[ino1];
           System.out.println(" Enter Number");

           for(iCnt = 0; iCnt<Arr.length; iCnt++)
           {
               Arr[iCnt] = Sobj.nextInt();
           }
           
          prog58 obj = new prog58();

          iret = obj.Avarage(Arr);

          System.out.println(" Avarage is "+ iret);

        
     }
}
