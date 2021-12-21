public class Checki_if_array_sorted {
    public  static int  recurse(int[] arr,int i){
        if(i==arr.length-1){
            //System.out.println("Sorted hai");
            return 0 ;
        }
        else{
            if(arr[i]<arr[i+1]){
               return recurse(arr,i+1);
            }
            else{
                //System.out.print("Not a Sorted Array");
                return 1;
            }
        }



    }
    public static void main(String args[]){
        int result=recurse(new int[]{1, 2, 3, -1},0);
        if(result==0){
            System.out.print("Sorted Array");
        }
        else{
            System.out.println("Unsorted Array");
        }
    }
}
