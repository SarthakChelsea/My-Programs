public class Recursionreverse2 {
    public static void reversing(String str1,int j){
        if(j==str1.length()){
            return ;
        }else{
        System.out.print(str1.charAt(str1.length()-1-j));
        reversing(str1,j+1);}
    }
    public static void main(String args[]){
        reversing("Sarthak",0);
    }
}
