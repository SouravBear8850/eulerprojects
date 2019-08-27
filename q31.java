public class q31 {

  public static void main(String[] args) {
   int target = 200;
int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
int[] ways = new int[target+1];//dynamic initialisation
ways[0] = 1;

for (int i = 0; i < 8; i++) {
    for (int j = coins[i]; j <=target; j++) {
        ways[j] += ways[j - coins[i]];
    }
}
System.out.println("Number of ways of getting £2="+ways[target]);
  }

}

