import java.util.*;
// program Tital : give value From user in Array Count >10 Number that Array that value
// using Helper Function
// Date /20/1/2021/                                                                                                                                                                
// Count  

class prog61
{
       void Count(int brr[])
       {
            int i = 0, iCnt = 0; 
            for(i = 0; i<brr.length; i++)
            {
                if(brr[i]>10)
                {
                    iCnt++;
                }
            }
           System.out.println(" Grater Than 10  Number is ::>"+iCnt);
       }


    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, iCnt = 0;
  
        System.out.println(" Enter Number OF Elemnts");
        ino1 = sobj.nextInt();

        int Arr[] = new int[ino1];

        System.out.println(" Enter Number");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
       prog61 obj = new prog61();
       obj.Count(Arr);
        
    }
}
