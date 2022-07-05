import java.util.*;
// Input : 1
// Output : 1

// Input : 3   >>>> 3 x 2 x 1 = 6
// Output : 6 

// Input : 5
// Output : 120

//  program Titale >gives  Number from use and return Factorial that Number
//  Date /7/ 1/ 2022

class prog14 
{
       int Factorial(int ino2)
       {
          int iCnt = 0, iFact = 1;

          for(iCnt = 1; iCnt<=ino2; iCnt++)  // loop make round same as u have give number 5
       {
           iFact = iFact * iCnt;  // round 1 > 5 * 4   ==== 
       }                          // round 2 > 4 * 3   ====
                                  // round 3 > 3 * 2   ====
      return iFact;               // round 4 > 2 * 1   ====  120

}
       
    public static void main(String arg[])
   {
   
    Scanner sobj = new Scanner(System .in);
    int ino1 = 0, iret = 0;

    System.out.println("Enetr Number\n");
      ino1 = sobj.nextInt();

     prog14 obj = new prog14();
      
     iret = obj.Factorial(ino1);

      System.out.println(iret);
      
   }

}
