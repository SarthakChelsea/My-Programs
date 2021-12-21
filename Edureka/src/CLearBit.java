public class CLearBit {
    public static void main(String args[]){//Clearing the ith position bit (i.e maikng it zero) in  number.
        // this also means Updating ith positioned bit in a number n to zero
        int n=5;//for example taking n as  5 (0101)and i as 3
        int i=2;
        int New=(~(1<<i)) & n;
        System.out.println(New);
    }
}
