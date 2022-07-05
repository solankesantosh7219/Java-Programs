import java.util.*;  // Example >> 2
//  program Titale >Mod  operator it give  remindr if we Divide any Number
//  Date /8/ 1/ 2022/
class prog21 
{
       void Display()
       {
             int ino1 = 24810;
             int iDigit = 0;
            
             while(ino1>0) 
            {
               iDigit = ino1 % 10;  
              System.out.println(iDigit);
              ino1 = ino1 / 10;
            }
       }
        
    public static void main(String arg[])
    {
         Scanner Sobj = new Scanner(System.in);


          prog21 obj = new prog21();
          obj. Display();
    }
}
