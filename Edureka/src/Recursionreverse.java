import java.util.Scanner;

public class Recursionreverse {
    public static void reversing(String str1,int j,String r){
        if(j==str1.length()){
            System.out.println(r);
            return ;
        }
        else{
      r=r+str1.charAt(str1.length()-1-j);
        reversing(str1,j+1,r);}
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse="";
        for(int i=0;i<str.length();i++){
            reverse=reverse+str.charAt(str.length()-1-i);
        }
        System.out.println(reverse);
        reversing(str,0,"");


    }

}
