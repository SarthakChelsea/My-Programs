public class Recurse_Sum_Of_Digits {
    public static int sumofdigits(int n){
        if(n==0)
            return 1;
        if(n<10){
            return n;
        }
        return (n%10)+sumofdigits(n/10);


    }
    public static void main(String args[]){
        int num=10;
        System.out.println(sumofdigits(12));

    }
}
