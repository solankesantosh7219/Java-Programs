import java.util.*;
//   display number 1 to 10 on Screen  take hardcoreded Value
//   Date:: 7-01-2022
class prog6 
{
    
       void Display()
       {
            int i = 0;
            for( i = 0; i<10; i++)
            {
                 System.out.println(i);
            }
       }
    
      public static void main(String arg[])
     {

         Scanner Sobj = new Scanner (System.in);

          prog6 obj = new prog6();
          obj.Display();

     }

}
