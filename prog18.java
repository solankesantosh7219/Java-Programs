import java.util.*;  // Example >>> 1 
//  program Titale >gives  Number from user and return Factor that Number
//  example = 1, 2, ,3 ,4 , 6 = 12  saglya number ne gunakar kyla 12 Answer kadta yt
//  Date /8/ 1/ 2022/
// > Factor of are: 1,2,3,6,
// 1*6, 2*3, 3*2, 6*1 = 6 
class prog18 
{
     void Factor(int ino2)
     {
         int iCnt = 1;

         if(ino2<0)
         {
              ino2 = - ino2;
         }
        
         for(iCnt = 1; iCnt<=ino2; iCnt++)
         {
             if((ino2 % iCnt) == 0)   // Find Factor logic    
             { // mudlo check krnar kon kontya number ne bhag jato te  reminde kadun dynar
                  System.out.println( iCnt);
             }
         }
     }
  
  
    public static void main (String arg[])
    {

     Scanner  sobj = new Scanner(System.in);
     int ino1 = 0;

     System.out.println(" Enter Number\n");
     ino1 = sobj.nextInt();

     prog18 obj = new prog18();

     obj.Factor(ino1); // Function Call 
    
    }
}
