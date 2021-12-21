import java.util.*;
public class Conditions {


    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Even");

        }else{ System.out.println("Odd");}
        System.out.println("Enter another number");
        int b = sc.nextInt();
        if (a>b){
            System.out.print("First number is bigger");
        } else if(a<b){
            System.out.print("second number is bigger");
        }else System.out.println("Both are Equal");

        System.out.print("\nGives us your feedback out of 5\n");
        int rate = sc.nextInt();
        switch (rate){
            case 1:
                System.out.print("We surely will improve our performance next time");
                break;
            case 2:
                System.out.print("Sorry");
                break;
            case 3:
                System.out.print("nice");
                break;
            case 4:
                System.out.print("Thanks a lot");
                break;
            case 5:
                System.out.print("Glad you Liked it");
                break;
            default:System.out.print("I said a number between 1 to 5");

        }





    }
}
