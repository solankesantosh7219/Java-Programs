import java.util.*;
// program Title:: Display minimum Number
// Date /17/1/2022/
class prog43 
{      int Display(int value1, int value2)
       {
           int ireslut = 0;
           if(value1<value2) 
           {
                ireslut = value1;
           }
           else
           {
                ireslut =  value2;
           }
           return ireslut;
     }
     public static void main (String arg[])
     {
         Scanner sobj = new Scanner(System.in);
          int ino1 = 0, ino2 = 0,  iret = 0;

          System.out.println(" Enter First Number\n");
          ino1 = sobj.nextInt();

          System.out.println(" Enter Second Number\n");
          ino2 = sobj.nextInt();

           prog43 obj = new prog43();

        iret = obj.Display(ino1, ino2);

        System.out.println(" Minimum is "+iret);





     }
}
