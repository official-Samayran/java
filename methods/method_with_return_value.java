package methods;

public class method_with_return_value {
    public static void main (String[] args) {
        int sum = add(3, 56);
        System.out.println("Sum = " + sum);
    }
    public static int add(int a, int b){
        return a+b;
    }
}
