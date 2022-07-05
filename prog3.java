 import java.util.*;
// Accept number from user and display that number of * on screen.
// Input : 4
// Output : *   *   *   *  

// Input : 2
// Output : *   *   

 class prog3
{  
     public static void main (String arg[])
     {         
         Scanner sc = new Scanner (System.in);
          int ino1 = 0;
          
          System.out.println("Enter First Number: ");
     
           ino1 = sc.nextInt();
         
           Demo obj = new Demo();

           obj.Display(ino1);
          
     }  
}

class Demo
{
      void  Display(int ino2)
      {   int i = 0;
        
        for(i = 0; i<ino2; i++)
        {
          System.out.println(" *\t"); 
        }
        
      }
}