import java.util.*; 
// take Number from user  using 2 function 
// program Tital using modd operator we can got remindar any Number After Division
// Count total Number in reminder
// Date/8/1/2022/

class prog25 
{
      int CountDigit(int ino2)
      {
           int iCnt = 0, iDigit = 0;

           while (ino2>0) 
           {
             iDigit = ino2 %10;
             iCnt++;
             ino2 = ino2 /10;
           }
            return iCnt;
        }
    
    
    public static void main(String arg[])
    {
    Scanner sobj = new Scanner(System.in);
    int ino1 = 0, iret = 0;

    System.out.println(" Enter Number\n");
    ino1 = sobj.nextInt();

    prog25 obj = new prog25();

    iret = obj.CountDigit(ino1);

    System.out.println(iret);

    }
}
