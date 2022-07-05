import java.util.*;
// program Titale take Number From user and convert this Number reverse order using for loop
// exmple give number 7 
// Display ... 7654321
// Date 7/1/2022

class prog12
{
       void Display(int ino2)
       {
            int i = 0;
          
          for(i = ino2; i>=1; i--)
          {
               System.out.print( " \t"+ i);
          }
       }    


     public static void main(String arg[])
     {
          Scanner sobj = new Scanner(System.in);
           int ino1 = 0; 

           System.out.println(" Enter Number\n");
           ino1 = sobj.nextInt();

           prog12 obj  =  new prog12();
           obj.Display(ino1);
     }
}
