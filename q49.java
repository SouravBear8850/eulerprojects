public class q49 {

  public static void main(String[] args) {
    int k,j,l;
    for(k=1001;k<10000;k++)
    {
      if(isprime(k)==1)
      for(j=1002;j<10000;j++)
         { l=0;
           if(isprime(j)==1)
          {
           l=j+(j-k);
           if(((isprime(l)==1)&&(isPerm(j,l)==1))&&(isPerm(k,l)==1)&&(j!=k))
           {
             System.out.print(k);
             System.out.print(j);//concatenation
             System.out.println(l);
             
            }
           }
         }
    }
  }
private static int isPerm(int m, int n) {
    int[] arr = new int[10];

    int temp = n;
    while(temp > 0){
        arr[temp % 10]++;
        temp /= 10;
    }

    temp = m;
    while(temp > 0){
        arr[temp % 10]--;
        temp /= 10;
    }

    for(int i = 0; i< 10; i++){
        if(arr[i] != 0){
            return 0;
        }
    }
    return 1;
}
public static int isprime(int num)
{ int i,c=0;
  for(i=2;i<num;i++)
  {
    if(num%i==0)
    c++;
  }
  if(c==0)
  return 1;
  else
  return 0;
}
}
