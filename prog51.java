import java.util.*;
// program Tital : take no From user and Display   Below Same Structure
// Date /17/1/2022/
/*
    iRow = 4
    iCol = 4
    #   #   #   #
    *   *   *   *
    #   #   #   #
    *   *   *   *
 */

 class prog51 
{  
        void Display(int iRows, int iColum)
        {
             int i = 0;
             int j = 0;

           for(i = 1; i<=iRows; i++)
           {
               for(j = 1; j<=iColum; j++)
               {
                   if((i % 2) == 0)
                   {
                      System.out.print(" #\t");
                   }
                 else
                 {
                     System.out.print(" *\t");
                 }
             }   
               System.out.print("\n");
       }
         
    }  
    
     public static void main (String arg[])
     {
       Scanner sobj = new Scanner(System.in);
       int ino1 = 0, ino2 = 0;

       System.out.println(" Enter iRows");
       ino1 = sobj.nextInt();

       System.out.println(" Enter Colum");
       ino2 = sobj.nextInt();

       prog51 obj = new prog51();
        obj.Display(ino1, ino2);
        
     }
}
