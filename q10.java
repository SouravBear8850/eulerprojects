

public class q10 {

  public static void main(String[] args) {
    long i,sum=0;
    int c=0;
    for(i=1;i<=2000000;i++)
    {
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          c++;
        }
        if(c==0)
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }

}
