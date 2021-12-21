public class Permutations_of_a_string {
    public static void main(String args[]){
        String Example="abc";
        char[] ex=Example.toCharArray();

        for(int i=0;i<Example.length();i++){
            String ans="";
            char currChar=Example.charAt(i);
            ans+=currChar;
            for(int j=0;j<ex.length;j++){
               if(i==j){
                   continue;
               }else{
               }
            }
        System.out.println(ans);



        }}
    }

