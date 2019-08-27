public class q39 {//a2+b2=c2
//c=p-a-b
//a2+b2=p2+a2+b2-2pa-2ba-2ab
//b=p2-2pa/(2p-2a)

  public static void main(String[] args) {
    long result=0,resultsol=0;
    int p=0;
    for(p=2;p<=1000;p++)//conclusions from q9 pythagoren triplets
    {int numsol=0;
      for(int a=1;a<p/3;a++)
      {
        if(p*(p-2*a)%(2*(p-a))==0)
        {
          numsol++;
        }
        
      } if(numsol>resultsol)
         {
            resultsol=numsol;
            result=p;
         }
      
    }
    System.out.println("the number of solutions pythogorean triplets maximised for p="+result);
  }

}

