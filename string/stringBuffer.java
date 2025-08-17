package string;

public class stringBuffer {
    public static void main (String[] args){
        StringBuffer name = new StringBuffer("Samayran");

        name.append (" is a Gentleman.");
        System.out.println(name);

        name.delete(5, 8);
        System.out.println(name);

        name.insert (3, " ");
        System.out.println(name);

        name.reverse();
        System.out.println(name);

        int n = name.length();
        System.out.println(n);
    }
}
