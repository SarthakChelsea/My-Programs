public class Recursion_fibonacci {
    public static void fibonacci(int a,int b,int n){
       int c=a+b;
       System.out.println(c);
       if(n==0){
           return;
       }else fibonacci(b,c,n-1);
    }
    public static void main(String args[]){
        int a=0,b=1,n=10;
        System.out.println(a+"\n"+b);
        fibonacci(a,b,n-2);
    }
}
