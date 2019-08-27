public class q15 {

  public static void main(String[] args) {
    int gsize=20;
    long[][] grid=new long[gsize+1][gsize+1];//i have used dynmaic initilisation
    for(int i=0;i<gsize;i++)
    {
      grid[i][gsize]=1;grid[gsize][i]=1;
    }
    for(int i=gsize-1;i>=0;i--)
    {
      for(int j=gsize-1;j>=0;j--)
      {
        grid[i][j]=grid[i+1][j]+grid[i][j+1];
      }
    }
    System.out.println(" largest Maximum routes in a 20*20 grid="+grid[0][0]);
  }

}

