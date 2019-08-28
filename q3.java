public class q3{
	


  public static void main(String[] args) {
   int count=1;
     for(int i=3;i>0;i=i+2)
     {
       if(isPrime(i)==1)
       count++;
       if(count==100001)
       {
     System.out.print("100001prime no="+i);
     break;}
     }
  }
public static int isPrime(int numm){
	


    if (numm <= 1) {
        return 0;
    }

    if(numm == 2){
        return 1;
    }

    if (numm % 2 == 0) {
        return 0;
    }

    int counter = 3;

    while ((counter * counter) <= numm) {
        if (numm % counter == 0) {
            return 0;
        } else {
            counter +=2;
        }
    }

    return 1;
}
}
