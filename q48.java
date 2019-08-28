public class q48 {

  public static void main(String[] args) {
   long sum=0;
   long modulo=1000000000;
   for (int i = 1; i <= 1000; i++) {
    long temp = i;
    for (int j = 1; j < i; j++) {
        temp *= i;
        temp %= modulo;
    }

    sum += temp;
    sum %= modulo;
}
  System.out.println(" First ten digits sum of power of digits ="+ sum);
  }

}
