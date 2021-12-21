public class New {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String word_1="";
    String word_2="";
    for(int k=0;k<word1.length;k++){
        word_1=word_1+word1[k];
    }
    for(int j=0;j<word2.length;j++){
        word_2=word_2+word2[j];
    }
    int check=0;
    if(word_1.length()==word_2.length()){
        for(int i=0;i<word_1.length();i++){
            if(word_1.charAt(i)==word_2.charAt(i)){
                check=1;

            }else{ check=0;}

        }
        if(check==0){
            return false;
        }else{return true;}
    }else{
        return false;
    }


}
    public static void main(String args[]){
        String[] word1={"ab","c"};
        String[] word2={"abc"};
        System.out.print(arrayStringsAreEqual(word1,word2));

    }
}
