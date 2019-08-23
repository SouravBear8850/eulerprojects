package questions;

public class q2 {

  public static void main(String[] args) {
   long firstno=0,secno=2,result=4;
     System.out.print(firstno+",");
     System.out.print(secno+",");
     System.out.print(result+",");
     
     while(true)
     {
       result=firstno+secno;
       if(result>4000000)
       break;
       firstno=secno;
       secno=firstno;
       System.out.print(result+",");
     }
     
  }

}
