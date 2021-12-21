import java.util.Scanner;

public class GetBit {
    public static void main(String args[]){ //To get the value of bit a certain position i in  a binary number  is called get bit
        //Steps:
        //Apply Bit mask :1<<i
        //then  the binary found in step 1 and the original are operated on AND
        // if answer of and is non zero then vale at position is 1 or else zero
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        System.out.println("Enter Position you want to check bit");
        int i=sc.nextInt();
        int x=1<<i;
        if((x & n)==0){
            System.out.println("Bit is zero");
        }else {
            System.out.println("Bit is One");
        }
    }
}
