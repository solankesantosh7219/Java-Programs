import java.util.*;
// program Tital : take no From user and Display  Rows and Colum that Number
// 3 rows   > *    *   *      3 < colum
//            *    *   *    
//            *    *   *    
//            *    *   *    
// using seprate  1 Helper Function
// Date /17/1/2022/

/*
    iRow = 4
    iCol = 4
 
 colum   1   2   3 rows >
         1   2   3
         1   2   3
         1   2   3
 */
class prog49 
{
          void Display(int iRows, int Colum )
           { 
                int i = 0;
                int j = 0;
             for(i = 1; i<=iRows; i++)
             {
                 for(j = 1; j<=Colum; j++)
                 {
                    System.out.print(" *\t");
                 }
               System.out.println(" \n");
            }

     }

      public static void main (String arg[])
      {
          Scanner sobj = new Scanner(System.in);
           int ino1 = 0, ino2 =0;

           System.out.println(" Enter Rows...");
           ino1 = sobj.nextInt();

           System.out.println(" Enter Colum");
           ino2 = sobj.nextInt();

           prog49 obj = new prog49();

           obj.Display(ino1, ino2);

      } 
}
