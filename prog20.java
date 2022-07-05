import java.util.*;
//  program Titale >Mod  operator it give  remindr if we Divide any Number
//  Date /8/ 1/ 2022/
class prog20 
{
        void  Display()
        {
              int ino1 = 7521;
              int iDigit = 0;

              iDigit = ino1 %10;  // 1
              System.out.println( iDigit); // 
              ino1 = ino1 /10; // 752

              iDigit = ino1 %10;  // 2
              System.out.println(iDigit); // 2
              ino1 = ino1 /10; // 752

              iDigit = ino1 % 10; // 5
              System.out.println(iDigit); // 5
              ino1  = ino1 / 10; // 75

              iDigit = ino1 %10; // 7 
              System.out.println(iDigit); // 7
              ino1 = ino1 /10;  // 0
        }
   
    public static void main (String srg[])
    {
      Scanner sobj = new Scanner(System.in);
     
      prog20 obj = new prog20();
     
      obj.Display();

    
    }
}
