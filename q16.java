

public class q16 {

  public  static void main(String[] args) {
   double num=0;int sum;
   num= Math.pow(2,1000);
   sum=powerdigsum(num);
   System.out.print(sum);
  }
  public static int powerdigsum(double num)
  {int sum=0;
    while(num!=0)
    { double dig=num%10;
      num=num/10;
     sum=sum+(int)num;
    }
    return sum;
    
  }
}
