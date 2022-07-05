import java.util.*;
// program Title : give value From user in Array Check Deffirance in   Max Number and  Min Number
//  Array using Helper Function
// Date /22/02/2022/ 
// check Min Number in Arrayy

class prog65 
{    int Diffrance(int Brr[])
     {
          int i = 0;
          int imax = Brr[0], iMin = Brr[0];
          for(i = 0; i<Brr.length; i++)
          {
              if(Brr[i]< iMin)
              {
                  iMin = Brr[i];
              }
            else if(Brr[i] > imax)
              {
                  imax = Brr[i];
              }
           }
         return imax - iMin;
       }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, iCnt = 0, iret = 0;

        System.out.println(" Emter Number Of Elements");
        ino1 = sobj.nextInt();

        int Arr[] = new int[ino1];
        System.out.println(" Enter Number");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
     
        prog65 obj = new prog65();
        iret =  obj.Diffrance(Arr);

      System.out.println(" Deffirance is >>"+iret);
    }

}
