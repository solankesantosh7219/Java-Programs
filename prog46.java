import java.util.*;
// program Tital : take no From user and Display ABCD Latter on that Number
// using seprate  1 Helper Function
// Date /7/12/2021/

// Input :       6
// iCnt           1    2   3   4    5   6
// Output :    a    b   c   d   e   f

// SAME PROGRAM BUT ONLY  CHANGE LOGIC...................

class prog46 
{   
         void Display(int ino2)
         {
              int iCnt = 0;
              char ch = 0;   // changes 'A'
              
            for(iCnt = 1, ch = 'A';  iCnt<=ino2; iCnt++, ch++)
            {
               System.out.println(ch);
               // ch++ kru sakta
            }
             System.out.println(" ");
         }
   public static void main (String arg[])
   {
        Scanner sobj = new Scanner(System.in);
            int ino = 0;
        System.out.println(" Enter Number\n");
          ino = sobj.nextInt();

         prog46 obj = new prog46();

         obj.Display(ino);
        

   }
    
}
