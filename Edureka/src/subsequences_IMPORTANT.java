import java.util.HashMap;
import java.util.HashSet;

public class subsequences_IMPORTANT {
    public static void subsequences(String str, int i, String ans, HashSet<String> set){
        if(i==str.length()){
            if(set.contains(ans)){
                return;
            }else{
            System.out.println(ans);
            set.add(ans);
            return;}
        }else{
        subsequences(str,i+1,ans+str.charAt(i),set);
        subsequences(str,i+1,ans,set);}
    }
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();//for unique cases hash set is important ,jab string repetetive ho toh nique subsequences dena
        subsequences("aaa",0,"",set);

    }
}
