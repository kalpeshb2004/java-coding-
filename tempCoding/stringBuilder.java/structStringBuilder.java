
public class structStringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("kalpesh");
        //print
        System.out.println(name);
        //charAt
        System.out.println(name.charAt(0));

        //set chat at means replacement of character
        name.setCharAt(0, 'A');
        System.out.println(name);

        //delete
        System.out.println(name.delete(6, 7)); 

        //append
        System.out.println(name.append('b'));

        //length
        System.out.println(name.length());

    }
}
