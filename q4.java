public class q4 {

  public static void main(String[] args) {
      int i=0,c=0;
      long prod=1,nnum=0,placeval=100000,dig=0,num=0;
      for(i=999;i>=100;i--)
      {
        for(int j=999;j>=100;j--)
        {
          prod=i*j;
          num=prod;
          while(num>0)
          {
            dig=num%10;
            nnum=nnum+(dig*placeval);
            num=num/10;
            placeval/=10;
             
          }
          if(prod==nnum)
          break a;
      
        }
      }
      a:
      System.out.print(num);
  }

}
