public class q25 {

  public static void main(String[] args) {
    int a=1,b=1,count=2,c=2,temp=0,cdig=0;
    int dig=0;
    while(cdig<=1000)
    {
    c=a+b;
    a=b;
    b=c;
    count++;
    temp=c;
    
       while(temp>0)
       {
         dig=temp%10;
         temp=temp/10;
         cdig++;
       }
    }
    System.out.print("the first 3digit fibonacci number is="+ c + "and the index is="+ count);
  }

}
