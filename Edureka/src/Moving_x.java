public class Moving_x {
    public static void recurse(String s1,String orignal,String res,int i){
        if(i==s1.length()){
            System.out.print(orignal+res);
            return ;
        }
        else{
            if(s1.charAt(i)=='x'){
                res=res+s1.charAt(i);
            }
            else{
                orignal=orignal+s1.charAt(i);
            }
            recurse(s1,orignal,res,i+1);
        }
    }
    public static void main(String args[]){
        String s="axbxcxxd",n="",residue="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='x'){
                n=n+s.charAt(i);
            }
            else{
                residue=residue+s.charAt(i);
            }

        }
        System.out.println(n+residue);
        recurse(s,"","",0);

    }
}
