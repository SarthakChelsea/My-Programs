public class RecursionXtothepowern_2 {
    public static int power(int x,int n){
        if(x==0 || n==0){return 1;
        }
        if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }else{return x*power(x,n/2)*power(x,n/2);
        }
    }
    public static void main(String args[]){
        int n=power(2,3);

    }
}
