import java.util.*;
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num = sc.nextFloat();
        float i=2;
       while(i<num){
           if(num%i==0){
               System.out.println("Non Prime");
               break;
           }
           else{
               System.out.println("Prime");

           }
           i++;

       }





        }
    }


