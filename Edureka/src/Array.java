import java.util.*;
public class Array {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array");
        int size=sc.nextInt();

        int marks[]= new int[size];
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter "+i+" 1element");
            marks[i]=sc.nextInt();
        }
        int x=6;
        for(int j=0;j<size;j++) {
            if(marks[j]==x){
                System.out.print(x+" found at index:"+j);
                break;

            }else{
                continue;
            }

        }
    }
}
