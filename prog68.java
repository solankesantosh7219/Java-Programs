   import java.util.*;
   // program Tital : give value From user in Array Check  Number checkNumber is ther which index not Array using Helper Function
   // Date /23/1/2022/ 
   // serach  Number is there or not  in Arrayy
   
class prog68 
{           
      int FirstOccurance(int Brr[], int ino3)
     {
            int i = 0, index =-1;
        for(i = 0;  i<Brr.length; i++)
        {
            if(Brr[i] == ino3)
            {
                index = i;
            }
                
        }
       
        return index;  
    } 

   public static void main (String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      int ino1 = 0, ino2 = 0, iCnt = 0;
      int  iret = 0;

      System.out.println(" Enter Number of Elelmnts");
      ino1 = sobj.nextInt();

      int Arr[] = new int[ino1];
      System.out.println(" Enter Number");
      for(iCnt = 0; iCnt<Arr.length; iCnt++)
      {
          Arr[iCnt] = sobj.nextInt();
      }
      
        System.out.println(" Enter Search Number");
        ino2 = sobj.nextInt();

        prog68 obj = new prog68();
        iret = obj.FirstOccurance(Arr,ino2);
        
        if(iret == -1) 
        {
            System.out.println(" There is no Such Number");
        }
        else
        {
           System.out.println(" Number is there at index"+iret);
        }
  
  
    }

}
