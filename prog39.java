import java.util.*;
// program Title : take no From user and Display reverse Number on that Number
// using seprate  1 Helper Function
// Date /11/1/2022/
// Input :      5
// Output :     5   4   3   2   1

class Demo
{
    void Display(int ino2)
    { int iCnt  = 0;

     for(iCnt = ino2; iCnt>0; iCnt--)

        System.out.println(" revrse number is "+iCnt);
       
    }
}

class prog39 
{
    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino = 0;

        System.out.println("Enter  Number\n");
         ino = sobj.nextInt();

         Demo obj = new Demo();
         obj.Display(ino);

        
    }
}
