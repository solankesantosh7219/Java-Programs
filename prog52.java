import java.util.*;


/*
   // program Tital : take no From user and Display   Below Same Structure
   // Date /17/1/2022/ 
    
    iRow = 6

    iCol = 6
 
    $   #   #  #
    *   $   #  #
    *   *   $   #
    *   *   *   $
 */
class prog52 
{       void Display(int iRows, int Colum)
        {
            int i = 0;
            int j = 0;
          for(i = 1; i<=iRows; i++)
            {
                for(j = 1; j<=Colum; j++)
                {
                    if(i > j)
                    { 
                       System.out.print(" *\t");  
                    }
                   else if  (i < j)
                   {
                     System.out.print(" #\t");
                   }
                 else 
                  {
                      System.out.print(" $\t");
                  }
               }
               System.out.println("\n");
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

          prog52 obj = new prog52();
           obj.Display(ino1, ino2);


    }
}
