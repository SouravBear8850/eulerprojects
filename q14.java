public class q14 {

  public static void main(String[] args) {
   int num=100000;
   long seqlength=0;
   long sequence;
   long startnum=0;
   for(int i=2;i<=num;i++)
   {
     int length=1;
     sequence =i;
     while(sequence!=1)
     {
       if((sequence%2)==0)
       {
         sequence=sequence/2;
       }
       else
       {
         sequence=sequence*3+1;
       }
       length++;
       
     }
     if(length>seqlength)
     {
       seqlength=length;
       startnum=i;
     }
   }
   System.out.println("starting number="+startnum+"length of the sequence="+seqlength);
  }

}
