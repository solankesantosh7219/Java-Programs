import java.util.*;
// program Tital : take no From user OR Count  Total Number gratar 5
// using seprate  1 Helper Function
// Date /17/1/2022/

// Input : 127894 
// Output : 3

// Input : 561750
// Output : 4


class prog44 
{
      int Display(int value1)
      {
          int iCnt = 0;
          int iDigit = 0;

          while(value1>0) 
          {
              iDigit = value1 %10; // Division  karun return reminder
              if (iDigit>= 5) 
              {
                   iCnt++; // a Greatr than 5 asl count that Number
              }
              value1 = value1 /10;
          }
       return iCnt;
   }


   public static void  main (String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      int ino1 = 0, iret = 0;

      System.out.println("Enter First Number");
       ino1 = sobj.nextInt();

       prog44 obj = new prog44();

       iret = obj.Display(ino1);

       System.out.println(" GreterThan Number are "+ iret);

        
   }
    

}
