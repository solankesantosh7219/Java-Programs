import java .util.*;

class prog9
  {
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);
       int ino1 = 0;
       
        System.out.println("Enter Number\n");
        ino1 = sobj.nextInt();
       
        Demo obj = new Demo();

         obj. Display(ino1);
    }

}


class Demo 
{
     
     void Display(int ino2)
     {
         int i = 0;

         for(i = 0; i<ino2; i++)
         {
              System.out.println(" Marvellous");
         }
          
     }
}
  



