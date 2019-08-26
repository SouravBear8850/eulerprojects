package questions;

public class q3 {

  public static void main(String[] args) {
   int count=0;
     for(int i=1;i>0;i++)
     {
       if(isPrime(i)==true)
       count++;
       if(count==100001)
       {
     System.out.print("100001prime no="+i);
     break;}
     }
  }
public static boolean isprime(int numm)

    if (numm <= 1) {
        return false;
    }

    if(numm == 2){
        return true;
    }

    if (numm % 2 == 0) {
        return false;
    }

    int counter = 3;

    while ((counter * counter) <= numm) {
        if (numm % counter == 0) {
            return false;
        } else {
            counter +=2
        }
    }

    return true;
}
}





