import java . util.*;
// program Title Check Perfect Number is  or not
// using seprate 2 Helper Function
// Date /9/1/2022/
// 1+2+3 = 6 
// 1+2+4+7+14 = 28
class prog33 
{
      boolean CheckPerFact(int input)  
      {
          int rNumber = 0;
          rNumber = SumFactor(input);

          if(rNumber == input) 
          {
              return true;  
          }
         else
         {
              return false;
         } 
 
  }
        
      int SumFactor(int ino)
      {
          int isum = 0, iCnt = 0;

          for(iCnt = 1; iCnt<=ino/2; iCnt++)
          {  
               if((ino % iCnt) == 0)  // logic 
               {
                isum = isum + iCnt;
               }
            
              
          }
         return isum;
      }
 
    public static void main(String arg[])
 {
      Scanner sobj = new Scanner(System.in);
      int ino1 = 0;
      boolean iret = false;

      System.out.println(" Enter Number\n");
       ino1 = sobj.nextInt();

       prog33 obj = new prog33();
      iret = obj.CheckPerFact(ino1);
     
     if(iret == true) 
     {
         System.out.println(" It is PerFact Number ");
     }
     else
     {
          System.out.println(" It is Not PerFect Number");
     }
    
    }
}
