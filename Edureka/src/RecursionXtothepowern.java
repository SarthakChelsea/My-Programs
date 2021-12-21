public class RecursionXtothepowern {//with stack height n
    public static int power(int x,int n){
        if(x==0 || n==0){
            return 1;
        }
        else{
            return x*power(x,n-1);
        }
    }
    public static void main(String args[]){
        int ans=power(2,3);
        System.out.println(ans);
    }
}

