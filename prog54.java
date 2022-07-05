import java . util.*;

 // program Tital : take no From user and Display   Below Same Structure
   // Date /7/12/2021/ 

/*
    iRow = 4

    iCol = 4

 *
 *  *
 *  *   *
 *  *   *   *
 */

class prog54 
{ 
       void Display(int iRows, int Colum) 
       {
            int i  = 0;
            int j  = 0;
           for(i = 1; i<=iRows; i++)
           {
               for(j = 1; j<=Colum; j++)
               {
                    if(i>=j)
                    {
                         System.out.print(" *\t");
                    }
                }
              System.out.println(" \n");
            }
       
     }

    public static void main (String arg[])
    {
        Scanner sobj = new Scanner (System.in);
        int ino1 = 0 , ino2 = 0;

        System.out.println(" Enter First Number");
         ino1 = sobj.nextInt();

         System.out.println(" Enter Second Number");
         ino2 = sobj.nextInt();

         prog54 obj = new prog54();

         obj.Display(ino1 , ino2 );
    }
}
