import java.util.*;
//   Display Marvellous on Scrren 7 time Haradcorevalue
//   Date:: 7-01-2022
class prog8 
{
     void Display()
     {
          int i  = 0;
          for(i = 0; i<8; i++)
          {
               System.out.println(" Marvellous\t ");
          }
     }
    
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

         prog8 obj = new prog8();
         obj.Display();
    }
}
