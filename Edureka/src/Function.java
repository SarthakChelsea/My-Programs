import java.util.*;
public class Function {
    public static int fact(int a){
       int j=1;
     for(int i=1;i<=a;i++){
         j=j*i;
     }
       return j;


    }
    public static void main(String args[]){
        int n=5;
      System.out.println(fact(n));

    }
}
