public class Unique_elements {
    public static boolean[] map=new boolean[26];
    public static void Unique(String str,int i,String ans ){
        if(i==str.length()){
            System.out.println(ans);
        }else{
        if(map[str.charAt(i)-'a']==true){
            Unique(str,i+1,ans);
        }
        else{
            ans+=str.charAt(i);
            map[str.charAt(i)-'a']=true;
            Unique(str,i+1,ans);
        }}

    }
    public static void main(String args[]){
        String s="aabbccddaa";
        Unique(s,0,"");



    }
}
