package control_flow_statements.loops;

public class nested_loops {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=10; j++) {
                System.out.println(i*j + " ");
            }
            System.out.println();
        }
    }
}
