

public class q16 {

  public  void main(String[] args) {
   double num=0;
   num= Math.pow(2,1000);
   int sum=powerdigsum(num);
   System.out.print("sum");
  }
  public int powerdigsum(double num)
  {int sum;
    while(num!=0)
    { double dig=num%10;
      num=num/10;
     sum=sum+num;
    }
    return sum;
    
  }
}
