import java.util.*;
// program Titale Addition of  1 Number using for loop 
// exmple give number  
// 
// Display ... 6,  , 15
// Date 7/1/2022

// Input : 3
// Output : 6

// Input : 5
// Output : 15

class prog13 
{

        int  Display(int ino2)
        {
            int iCnt = 0, isum = 0;

            for (iCnt = 1; iCnt <=ino2; iCnt++)
        {
         
              isum = isum + iCnt;
       
        }

   return isum;
}

     public  static void main(String arg[])
     {
      
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, ino2 = 0;

        System.out.println(" Enter Number\n");
        ino1 = sobj.nextInt();

        prog13 obj = new prog13();
        ino2 = obj.Display(ino1);

        System.out.println(ino2);

     }
}
