import java.util.*;
// program Tital : take no From user and Display   Below Same Structure 
//    iRow = 4
//    iCol = 4
 
//   $   *   *   *
 
//    *   $   *   *
 
//    *   *   $   *
 
//    *    *   *   $
                      
// using seprate  1 Helper Function
// Date /17/1/2022/

class prog50 
{      void Display(int iRows, int Colums)
       {
          int i = 0;
          int j = 0;

          for(i = 1; i<=iRows; i++)
          {
             for(j = 1; j<=Colums; j++)
             {
                if(i == j) 
                {
                  System.out.print(" $\t");
                }
              else
              {
                System.out.print(" *\t");
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

       System.out.println(" Enter Colums");
        ino2 = sobj.nextInt();

      prog50 obj = new prog50();
      obj.Display(ino1,ino2);
        
    }
}
