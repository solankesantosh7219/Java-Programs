 import java.util.*;
//  program Titale >gives  Number from user and return Factorial that Number
//  Date /8/ 1/ 2022/
//   For, and While LOOP,

// Input : 1
// Output : 1

// Input : 3
// Output : 6

// Input : 5
// Output : 120
 class prog17
 {
     
    int Factorial(int ino2)
    {
        
        int iFact = 1;

    //    for(iCnt = 1; iCnt<=ino2; iCnt++)
    //    {
    //          iFact = iFact * iCnt;
    //    } 
    int iCnt = 1;
    while(iCnt<=ino2) 
    {
       iFact = iFact * iCnt;   
       iCnt++;
    }
        
        return iFact;
    }
    
    public static void main(String arg[])
    {
     Scanner sobj = new Scanner(System.in);
     int ino1 = 0, iret = 0;

     System.out.println(" Enter Number\n");
      ino1 = sobj.nextInt();

      prog17 obj = new prog17();
      iret = obj.Factorial(ino1);

      System.out.println(" Factorial is "+iret);
    } 
 }
