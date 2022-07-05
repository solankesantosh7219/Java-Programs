import java . util.*;
//  program Titale > take Number From user return Reminder whole Number
// Mod  operator it give  remindr if we Divide any Number
//  Date /8/ 1/ 2022/
public class prog22
{
     void Display(int ino2)
     {
         int iDigit =  0;

        while(ino2 >0)
        {
             iDigit = ino2 %10;
             System.out.println(iDigit);
             ino2 = ino2  /10;

        }

     }

    public static void main(String arg[])
    {
      Scanner Sobj = new Scanner(System.in);
      int ino1 = 0;

      System.out.println(" Enter Number\n");
       ino1 = Sobj. nextInt();

       prog22 obj = new prog22();
       
       obj.Display(ino1);  // Function Call
    
    }
}
