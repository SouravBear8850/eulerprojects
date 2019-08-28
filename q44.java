public class q44 {

  public static void main(String[] args) {
    int result=0,f=0;
    int i=1,m=0,n=0;
     
     while(f==0)
     {
       i++;
       n=i*((3*i)-1);
       for(int j=i-1;j>0;j--)
         {
            m =j*((3*j)-1);
           if((ispentagon(n-m)==1)&&(ispentagon(m+n)==1))
           result=n-m;
           f=1;
           break;
         }
     }
     System.out.println("pentagonal pairs are=" + n +","+ m);
     System.out.println("Difference of pairs ="+result);
  }

  public static int ispentagon(int num)
  {
    double i=(Math.sqrt(1+24*num)+1.0)/6.0;//inverse of pentagon function
    if(i==(int)i)
    {
      return 1;
    }
    else 
    return 0;
  }
}
