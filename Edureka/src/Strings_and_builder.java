public class Strings_and_builder {
    public static void main(String args[]){
        char c= 'k';

        StringBuilder sb= new StringBuilder("Sarthak Mahapatra");
        System.out.println(sb.compareTo(new StringBuilder("Riddhi Chopra")));
        System.out.println(sb.append(" CHutiya"));
        System.out.println(sb.delete(8,17));
        sb.setCharAt(0,c);
        System.out.println(sb.reverse());


    }
}
