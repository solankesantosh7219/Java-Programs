import java.util.*;

class prog35 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino = 0 , iCnt = 0, Table = 0;

        System.out.println(" Enter Number");
        ino = sobj.nextInt();

        if(ino == 0)
        {
            return;
        }
        if(ino <0)
        {
            ino = - ino;
        }
    
       for(iCnt = 1; iCnt<=10; iCnt++)
       {
           Table = iCnt * ino;

         System.out.println(" Table is ...:"+Table);
       }
    }

}
