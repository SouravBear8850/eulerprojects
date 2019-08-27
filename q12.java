package questions;

public class q12 {

  public static int trianglenumber() {
   long i,sum=0;
   
   int c;
   for(i=1000;i>0;i++)
   { sum=0;c=2;
     for(int j=1;j<=i;j++)
     {
       sum=sum +i;
     }
     
     for(int k=2;k<sum;k++)
     {
        if(sum%k==0)
        {
          c++;
        }
         if(c>=500 )
         return i;
         
     }
   }
  }
 public static void main(String args[])
 {
   long num=trianglenumber();
   System.out.print("triangle numberwith 500 divisors is="+num);
 }
}
