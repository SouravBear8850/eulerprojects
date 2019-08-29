

public class q6 {

  public static void main(String[] args)
   {int sum=0,sqsum=0,diffsum=0;
      for(int i=1;i<101;i++)
      {
        sum=sum+i;
        sqsum=sqsum+i*i;
      }

  } diffsum=(sum*sum)-sqsum;
  System.out.println("difference of sum="+diffsum);

}
