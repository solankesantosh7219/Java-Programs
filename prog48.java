import java.util.*;
// program Tital : take no From user and Display  Rows and Colum that Number
// 4 rows   > *    *   *    *  4 < colum
//            *    *   *    *
//            *    *   *    *
//            *    *   *    *
// using seprate  1 Helper Function
// Date /17/1/2022/
class prog48
{        void Display(int iRow , int iColum)
        {
            int iCnt1 = 0;
            int iCnt2 = 0;

         for(iCnt1 = 1; iCnt1<=iRow; iCnt1++)
         {
             for(iCnt2 = 1; iCnt2<=iColum; iCnt2++)
             {
                System.out.print(" *\t ");   // for Horizantal Display 
             }
               System.out.println("\n");    // we Need write Second Display Function for 
                                            // for Perfect Display
        }
           
    }
    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, ino2 = 0;

        System.out.println(" Enter Rows:\n");
        ino1 = sobj.nextInt();

        System.out.println(" Enter Colum:\n");
        ino2 = sobj.nextInt();
        
        prog48 obj = new prog48();

        obj.Display(ino1, ino2);


    }
}