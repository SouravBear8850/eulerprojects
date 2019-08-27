public class q34 {

  public static void main(String[] args) {
    long i,sumc=0,num=0;
    long p=1,sum=0,dig=0;
    for(i=11;i<=1000000;i++)
    { num=i;
    while(num>0){
      dig=num%10;
      for(int j=1;j<=dig;j++)
      {
          p=p*j;
      }
      num=num/10;
      sum=sum+p;
      }
      if(i==sum)
      {
        sumc=sumc+i;
        
      }
      
    }
    System.out.println("sum of curious numbers ="+sumc);
  }

}
