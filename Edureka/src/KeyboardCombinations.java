import java.util.Scanner;

public class KeyboardCombinations {
    public static String[] keyboard={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   public static void recurse(String str,int idx,String ans){
       if(idx==str.length()){
           System.out.println(ans);
           return;
       }
       else{
           for(int k=0;k<keyboard[str.charAt(idx)-'0'].length();k++){
               char curr=keyboard[str.charAt(idx)-'0'].charAt(k);
           recurse(str,idx+1,ans+curr);

       }}

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1="23";
        recurse(str1,0,"");



    }
}
