
import java.util.*;
// program titale > Accept Number From user and Dsiplay Number on that Number
// exmple give number 7 
// Display ... 1234567
// Date 7/1/2022

 class Demo
 {
      void Display(int ino2)
      {
          int i = 0;
          for(i = 0; i<ino2; i++)
          {
               System.out.println(" Marvellous");
          }
      }
      
 }

class prog10 
{
   public  static void main(String arg[])
   {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0;
       
        System.out.println("Enter Number\n");
         ino1 = sobj.nextInt();    // take input 
     
         Demo obj = new Demo(); // cerate obj Demo class 
      
        obj.Display(ino1);


   }

}
