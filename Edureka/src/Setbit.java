import java.util.Scanner;

public class Setbit {
    public static void main(String args[]){//To change a bit on the position i in a binary number
        //Also means to Update ith positioned bit in a number n to 1
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int newnumber=(1<<i) | n ;
        System.out.println(newnumber);
    }
}
