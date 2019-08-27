
public class q21 {

  public static void main(String[] args) {
   int sumAmicible = 0;
int factorsi, factorsj;

for (int i = 2; i <= 10000; i++) {
    factorsi = sumOfFactors(i);
    if (factorsi > i && factorsi <=10000) {
        factorsj = sumOfFactors(factorsi);
        if (factorsj == i) {
            sumAmicible += i + factorsi;
        }
    }
}
System.out.println("sum of Amicible number under 10000=" + sumAmicible);
}

public static int sumOfFactors(int number) {
    int sqrtOfNum = (int)Math.sqrt(number);
    int sum = 1;

    if (number == sqrtOfNum * sqrtOfNum) {
        sum += sqrtOfNum;
        sqrtOfNum--;
    }

    for (int i = 2; i <= sqrtOfNum; i++) {
        if (number % i == 0) {
            sum = sum + i + (number / i);
        }
    }

    return sum;
}
  

}
