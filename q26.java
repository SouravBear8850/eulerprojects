public class q26 {

  public static void main(String[] args) {
  int length=0;
  
  for(int i=1000;i>1;i--)
  {
    if(length>=i)
    {
      break;
    }
    int[] remainders=new int[i];//remainder of d upti d-1
    int val=1;
    int pos =0;
    while(remainders[val]==0&& val!=0)
    {
      remainders[val]=pos;
      val*=10;
      val%=i;
      pos++;
    }
    if( pos - remainders[val]>length)
    {
        length=pos-remainders[val];
    }
    }
    System.out.println("largest decimal place recurring cycle=" + length);
  
  }

}
