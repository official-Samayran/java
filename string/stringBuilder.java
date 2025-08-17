package string;

public class stringBuilder {
    public static void main (String[] args){
        StringBuilder name = new StringBuilder("Samayran");

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
