import java.util.*;

// program Tital : take no From user if Number is Even Display * OR Display #  Number on that Number
// using seprate  1 Helper Function
// Date /11/1/2022/
// Input :      5

// Input :      6

// iCnt          1    2   3   4    5   6

// Output :    *    #   *   #   *   #

class Demo
{
      void Display(int ino2)
      {
           int iCnt = 0;
         for(iCnt = 0; iCnt<=ino2; iCnt++)
         {
             if((iCnt % 2) == 0)
             {
                  System.out.println(" #");
             }
         
             else
             {
                 System.out.println(" *");
             }
         } 
    }
}

class prog41 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0;

        System.out.println(" Enter  Number\n");
        ino1 = sobj.nextInt();
       
        Demo obj = new Demo();
        obj.Display(ino1);


    }
    

}
