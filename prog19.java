import java.util.*; // // Example >>> 2
 //  program Titale >gives  Number from user and return Factor that Number
//  example = 1, 2, ,3 ,4 , 6 = 12  saglya number ne gunakar kyla 12 Answer kadta yt
//  Date /8/ 1/ 2022/
// > Factor of are: 1,2,3,6,
// 1*6, 2*3, 3*2, 6*1 = 6 
 
 class prog19 
 {
    
    void Factor(int ino)
    {
         int iCnt = 0;

         if( ino<0)
         {
           ino = - ino;
         }
    
        for(iCnt = 1; iCnt<=ino/2; iCnt++) // we can write  this type of logic /2  for Factor
        {
             if((ino % iCnt)== 0)
             {
                  System.out.println( iCnt);
             }
        }
    
    }
    
    public static void main (String arg[])
    {
    Scanner sobj = new Scanner(System.in);
     int ino1 =  0;

     System.out.println(" Enter Number\n");
        ino1 = sobj.nextInt();

        prog19  obj = new prog19();

        obj.Factor(ino1);

     /*
iValue = 8

(8 % 1) == 0            1
(8 % 2) == 0            2
(8 % 3) == 0
(8 % 4) == 0            4
(8 % 5) == 0
(8 % 6) == 0
(8 % 7) == 0
 
 */   
    
    }
}
