
import java.util.*;
//   display that number of * on screen. call Display function in main Function
//   Date:: 7-01-2022
class prog5
{
       
      void Display()
      {
           int i = 0;
        
           for(i = 0; i<6; i++)
           {
                System.out.println("*\t");
           }
      }


    public static void main (String arg[])
    {
        Scanner sobj = new Scanner (System.in);

        prog5 obj = new prog5();

       obj.Display();
      
    }


}
