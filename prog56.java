import java.util.*;
// program Tital : Array Basic Structrue
   // Date /19/1/2022/
class prog56 
{
    public static void main (String arg[]) 
    {
         Scanner Sobj = new Scanner(System.in);
    
         System.out.println(" Enter Number\n");
         int ino1 = 0;
          int Array[] = new int[]{10,20, 30, 40, 50};
          int isum  = 0;

           System.out.println (" "+ Array[0]);
           System.out.println (" "+ Array[1]);
           System.out.println (" "+ Array [2]);
           System.out.println (" "+ Array[3]);
           System.out.println (" "+ Array[4]);

          isum = Array[0] + Array[1]+ Array[2]+ Array[3]+ Array[4];
          System.out.println(" Addition is "+isum);
          
    }
}
