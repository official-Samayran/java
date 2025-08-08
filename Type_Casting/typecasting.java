package Type_Casting;

public class typecasting{
    public static void main(String[] args) {
        int myInt = 7;
        double myDouble = myInt;
        System.out.println("Int to Double - " + myDouble);

        double myDouble2 = 12.6;
        int myInt2 = (int) myDouble2;
        System.out.println("Double to Int - " + myInt2);
    }
}