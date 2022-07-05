import java.util.*;
// program Tital : take no From user OR Display Avarge  Number on that Number
// using seprate  1 Helper Function
// Date /11/1/2022/
// Input :  

class Demo
{
       float Display(int value1 , int value2, int value3)
       {
           float fReslut = 0.f;
            int  isum = 0;

            isum = value1 + value2 + value3; // Addition kra

             fReslut = isum /3;  // bhagakar kra
            
             return fReslut;
       }
}

class prog42 
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);
        int ino1 = 0, ino2 = 0, ino3 = 0;
        float iret = 0.f;
       System.out.println(" Enter First Number\n");
       ino1 = sobj.nextInt();

       System.out.println(" Enter Second Number\n");
       ino2 = sobj.nextInt();

       System.out.println(" Enter thrd Number\n");
       ino3 = sobj.nextInt();

       Demo obj = new Demo();
        iret = obj.Display(ino1, ino2, ino3);
    
       System.out.println(" Avarge is "+ iret);
    }
}
