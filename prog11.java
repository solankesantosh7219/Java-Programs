import java.util.*;
// program titale > Accept Number From user and Dsiplay Number on that Number
// in program used Upadter Condition 
// exmple give number 7 
// Display ... 1234567
// Date 7/1/2022

class Demo
{
     void Display(int ino2)
     {
          int i = 0;
         if (ino2 == 0) 
         {
              System.out.println(" we type 0 th Number\n"); // warrnig you can Enterd 0 th Number
         }
         if (ino2<0) 
         {
             ino2  = - ino2; // if give - value updator incrase there value
         }
         
          for(i = 1; i<ino2; i++)
          {
               System.out.println("  "+i);
          }

        }

    }


class prog11
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
