import java.util.*;
// program Tital : take no From user and Display  Rows and Colum that Number
// 4 rows   > *    *   *    *  4 < colum
//            *    *   *    *
//            *    *   *    *
//            *    *   *    *
// using seprate  1 Helper Function
// Date /17/1/2022/
class prog47 
{      void Display()
       {
           int iRow = 4;
           int jcolum = 4;


           int j = 0;
           int i = 0;
        
        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j<=jcolum; j++)
            {
                System.out.print(" \t* ");  // for Horizantal Display
            } 
               System.out.println("  \n");
          }
       }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        
         prog47 obj = new prog47();
         obj.Display();

    }
    
}
