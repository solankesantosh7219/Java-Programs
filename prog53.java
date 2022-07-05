import java.util.*;

class prog53
{       void  Display(int iRows, int Colum)
        {
            int i = 0;
            int j = 0;
         
            if(iRows != Colum)  // same nasel tr return kra   example>>>  rows>>5     colum>>6 
            {  //   == Asel tr Condition Apply honar
               System.out.println(" Type Same Colum, and iRows");
            
         
            for(i = 1; i<=iRows; i++)
            {
                for(j = 1; j<=Colum; j++)
                {
                    if(i > j)
                    { 
                       System.out.print(" *\t");  
                    }
                   else if  (i < j)
                   {
                     System.out.print(" #\t");
                   }
                 else 
                  {
                      System.out.print(" $\t");
                  }
               }
             
               System.out.println("\n");
              }
            }
        }
    
    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
         int ino1 = 0, ino2 = 0;

         System.out.println(" Enter iRows");
         ino1 = sobj.nextInt();

         System.out.println(" Enter Colum");
         ino2 = sobj.nextInt();

          prog52 obj = new prog52();
           obj.Display(ino1, ino2);


    }
}
