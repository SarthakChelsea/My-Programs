public class Twosumproblem {
    public static int power(int base,int expo){int sol=1;
        for (int i=expo;i>0;i--){
             sol=sol*base;
        }
        return sol;
    }
    public static  int[] plusOne(int arr[]){
        int num=0;
        for(int i=arr.length-1;i>=0;i--){
            num=num+(arr[i]*power(10,i));
        }
        num=num+1;int length=0;
        for(int y=1;num!=0;y++){
            num=num/10;
            length=length+y;
        }

            int ans1[]=new int[length];
            for(int j=0;num!=0;j++){
                ans1[j]=num%10;
                num=num/10;
               } return ans1;}



    public static void main(String args[]){

        int[] arr={1,2,3,4,5};


        int num=0;
        for(int i=arr.length-1;i>=0;i--){
            num=num+(arr[i]*power(10,i));
        }
        System.out.println(num);
        num=num+1;int length=0;
        int z=num;
        for(int y=1;z!=0;z=z/10){
            y++;
            length=length+y;
        }System.out.println(length);
        System.out.println(num);

        int ans1[]=new int[length];
        for(int j=ans1.length;j>=0 & num!=0;j--){
            ans1[j]=num%10;
            num=num/10;}
       // System.out.println(ans1);





    }
}
