//   Program Titale > Addition of 2 Number using 2  Function
//   Date:: 6-01-2022
import java . util.*;

class prog1
{
             int Addition (int no1 ,int no2 )
             {
                  int ireslut = 0;

                  ireslut = no1 + no2;
                  return ireslut;
                  
             }
    public static void main(String arg[])
      {   
           Scanner s = new Scanner(System.in);
           int ino1 = 0 , ino2 = 0, iret = 0;
           
            System.out.print("Enter the first number: ");  
             ino1 = s.nextInt();  
            
            System.out.print("Enter the second number: ");  
             ino2 = s.nextInt();  
            
               prog1 obj = new prog1(); // create obj class Name
               
            iret =   obj. Addition (ino1 , ino2 );
      
            System.out.println(" Adddition is "+iret);

      }
}