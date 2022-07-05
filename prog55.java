import java.util.*;
// Program Title:: take no From user OR  Count Total Number Grater >5

public class prog55 
{

             void Display(int ino2)
             {
                  int iCnt = 0; 
                  int  iDigiat = 0, i = 0;

                while(ino2>0)
                  {     
                    iDigiat = ino2%10;
                     if (iDigiat >5) 
                      {
                         iCnt++;
                     
                      }
                    ino2 = ino2 /10;
                 }
                 System.out.println(iCnt); 
               
            }


     public  static void main(String arg[])
     {
          Scanner  sobj = new Scanner(System.in);
          int ino1 = 0;

          System.out.println(" Enter Number\n");
          ino1 = sobj.nextInt();

          prog55 obj = new prog55();

          obj.Display(ino1);
     }
}
