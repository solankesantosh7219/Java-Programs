import java.util.*;

// program Tital : take no From user and Display ABCD Latter on that Number
// using seprate  1 Helper Function
// Date /17/1/2022/

// Input :      6
// iCnt         1    2   3   4    5   6
// Output :     a    b   c   d   e   f
public class prog45 
{ 
         void Display(int ino2)
         {
              int iCnt = 0;
              char ch =  'A';
          for(iCnt = 1; iCnt<=ino2; iCnt++)
          {
                System.out.println(ch);
                 ch++;     // character ++ kra
          }
        System.out.println(" \n");
    }
        
        

    public static void main (String arg[])
    {
       Scanner sobj = new Scanner (System.in);
       int ino1  = 0;

       System.out.println("Enter the Number\n");
       ino1 = sobj.nextInt();

       prog45 obj = new prog45();
        obj.Display(ino1);

    }
    
}
