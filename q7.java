public class q7 {

  public static void main(String[] args) {
    long i,num=0;
    long c=5;
    for(i=11 ;i<=100000;i=i+2)
    {
      for(long j=2;j<=i/2;j++)
      {
        if(i%j==0)
        c++;
        
      }
      if(c==10001)
     { num=i;
      break;}
    }
   System.out.println(num);
  }
  

}
