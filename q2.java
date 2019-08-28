

public class q2 {

  public static void main(String[] args) {
   long firstno=0,secno=2,result=2;
     System.out.print(firstno+",");
     System.out.print(secno+",");
     


     while(true)
     {
       result=firstno+secno;
       if(result>4000000)
       break;
       firstno=secno;
       secno=result;
       System.out.print(result+",");
     }
     
  }

}
