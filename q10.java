

public class q10 {

  public static void main(String[] args) 
{
    long i,sum=2;
    int c;
    for(i=3;i<=2000000;i=i+2)
    {
      c=0;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          i=i/j;
          c++;
        }
        if(c==0)
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }

}
