import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        //System.out.println("Enter breadth");
        // int b=sc.nextInt();
        int i, j, fact;
        for (i = 1; i <= 2*l; i++) {
            for(j=1;j<=i;j++){
                System.out.print("*");
            }




                System.out.println();
            }
        }
    }
