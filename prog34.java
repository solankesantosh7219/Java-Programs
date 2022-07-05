import java.util.*;

class prog34 
{
    public static void main (String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         int ino = 5;
         int i = 0;
         if(ino == 0) 
         {
              return ;
         }
        
         if(ino<0) 
        {
            ino = -ino;
        }
        for(i = 1; i<=10; i++)
        {
           System.out.println(" Table is...:"+ino * i);
        }
    
    }
}
