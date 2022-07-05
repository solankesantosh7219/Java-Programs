import java . util.*;
// Input : 1
// Output : 1

// Input : 3   >>>> 3 x 2 x 1 = 6
// Output : 6 

// Input : 5
// Output : 120

//  program Titale >gives  Number from use and return Factorial that Number
//  Date /7/ 1/ 2022
class prog15 
{ 
          int  Factorial(int ino2)
        {
        int iCnt = 0;
          int iFact = 1;
        
        if( ino2 < 0)
        {
             ino2 = - ino2;
        }
    
        for(iCnt = 1;  iCnt<=ino2; iCnt++)
        {
               iFact = iFact * iCnt;
        }

             return iFact;
       }


    public static void main (String arg[])  
    {
       Scanner sobj = new Scanner(System.in);
        int ino1 = 0, iret = 0;

        System.out.println(" Enetr Number\n");
         ino1 = sobj.nextInt();

         prog15 obj = new prog15();

         iret = obj.Factorial(ino1);

         System.out.println(" Factprial is "+iret);
  }   
    
}
