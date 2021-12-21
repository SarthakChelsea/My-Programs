public class Recursion {
    public static int sum(int i,int n,int sum ){



        if(i==n+1){
           return sum;
       }else { System.out.println(i+" "+sum);
             return sum+=i+sum(i+1,n,sum);


       }

    }
    public static void main(String args[]){
         int x=sum(1,10,0);
         System.out.println(x);

    }
}
