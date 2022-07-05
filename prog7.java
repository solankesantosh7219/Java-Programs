import java.util.*;
//   Display number  and # one time on Scrren take hradcore Value
//   Date:: 7-01-2022
class prog7 
{
     
     void Display()
     {
         int i = 0;
        
          for(i = 0; i<7; i++)
          {
              System.out.println(" #\t"+i);
          }
     }
    
    public static void main (String arg[])
     {
           Scanner sobj = new Scanner(System.in);

           prog7 obj = new prog7();
          obj . Display();

     }
}
