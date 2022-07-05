import java.util.*;
// program Tital : take no From user and Display Even  Number on that Number
// using seprate  1 Helper Function
// Date /6/12/2021/
// Input :    5

// iCnt         1    2   3   4    5

// Output :    2    4   6   8   10

class Demo
{
    void Display(int ino1)
    { int iCnt  = 0;
         if(ino1 == 0)
         {
              return;
         }
        if(ino1<0)
        {
            ino1 = - ino1;
        }
        for(iCnt = 0; iCnt<=ino1; iCnt++)

        
       System.out.println(" Even Number"+iCnt * 2);
    }

}


class prog40 
{
   public static void main(String arg[])  
   {
        Scanner sobj = new Scanner(System.in);
        int ino = 0;

        System.out.println(" Enter Number\n");
        ino = sobj.nextInt();

        Demo obj = new Demo();
         obj.Display(ino);

   }
}
