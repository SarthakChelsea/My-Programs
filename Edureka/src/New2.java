public class New2 {

    public static void main(String args[]){
        String s="abc";
        String k="c";
        int count=0,ans=0;
        char[] sToarr=s.toCharArray();
        char[] kToarr=k.toCharArray();
        for(int i=0;i<kToarr.length;i++){
             char currChar=kToarr[i];
             for(int j=0;j< sToarr.length;j++){
                 if(currChar-sToarr[j]==0){
                     count++;
                     break;
                 }

             }

        }
        if(count==k.length()) {
            for(int x=0;x<sToarr.length;x++) {
                if (sToarr[x] - kToarr[0] == 0) {
                     ans = x;
                    break;
                }
            }
            System.out.println(ans);

            }
            else
            System.out.println(-1);



    }

}
