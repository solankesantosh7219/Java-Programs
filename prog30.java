import java.util.*;  //  Example >> 2
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Make Reverse  total Number in reminder 
// Date/9/1/2022/
class prog30 
{
        int Reverse(int ino2)
        {
             int iRev = 0, iDigit = 0;

             if(ino2 < 0) 
             {
                ino2 = - ino2; 
             }
            while(ino2>0) 
            {
                iDigit = ino2 %10;

                System.out.println(iDigit);
             
                 iRev = (iRev * 10) + iDigit;

                 ino2 = ino2 / 10;
            }
             return iRev;
        }
     public static void main(String arg[]) 
     {
          Scanner sobj = new Scanner(System.in);
          int ino1 = 0, iret = 0;

          System.out.println(" Enter Number\n");
          ino1 = sobj.nextInt();

          prog30 obj = new prog30();
        iret = obj.Reverse(ino1);

        System.out.println(" Revrse ::"+iret);
     }
}
