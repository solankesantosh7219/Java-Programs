import java.util.*;
// Date /11/1/2022
//  Program Title:: Take any Number From user and Display * on Same Number


class Demo
{
    void Display(int ino2)
    {  int iCnt = 0;

       for(iCnt = 0; iCnt<=ino2; iCnt++)
        
        System.out.println( " * ");
    }   
}


class prog37 
{
    
    
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         int ino1 = 0;

          System.out.println(" Enter First Number\n");
          ino1 = sobj.nextInt();

          Demo obj = new Demo();
          
          obj.Display(ino1);
    
    }
}
