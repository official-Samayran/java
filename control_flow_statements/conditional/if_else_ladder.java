package control_flow_statements.conditional;

public class if_else_ladder {
    public static void main(String[] args) {
        int num = 9;

        if (num>0) {
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("ZERO");
        }
    }
}
