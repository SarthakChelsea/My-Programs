public class FindingOccurence<first> {
    public static void recurse(String str1,char target,int j,int k,int l){

      if(l==str1.length()){
          System.out.println("\n"+j+","+k);
          return ;
      }
      else{
       if(target==str1.charAt(l)){
           if(j==-1){
               j=l;
           }
       }
       else if(target==str1.charAt(str1.length()-1-l)){
           if(k==-1){
               k=str1.length()-1-l;
           }}
       recurse(str1,target,j,k,l+1);
      }

    }
    public static void main(String args[]){
        String a="absgdgedhfaaaaqhwher";
        StringBuilder sb=new StringBuilder(a);
        char element='a';
        int first=-1,last=-1;
        //First Occurence
        for(int i=0;i<a.length();i++) {
            if(element==a.charAt(i)){
                if(first==-1){
                    first=i;
                }
            }
            else if(element==a.charAt(a.length()-1-i)){
                if(last==-1){
                    last=a.length()-1-i;
                }
            }

        }


        System.out.print(" First and Last Occurence at index: "+ first+","+last);
       recurse(a,element,-1,-1,0);

    }
}
