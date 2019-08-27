public class q20 {

  public static void main(String[] args) {
     
     int i,p=1,dig=0,sum=0;
     for(i=2;i<=100;i++)
     {
       p=p*i;
     }
     while(p<0)
     {
     dig=p%10;
     p=p/10;
     sum=sum+p;}
     System.out.print("sum of digits of 100!="+sum);
  }

}
