package control_flow_statements.switch_statement;

public class switch_statement {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
				System.out.println("Monday");
                break;
            case 2:
				System.out.println("Tuesday");
                break;
            case 3:
				System.out.println("Wednesday");
                break;
            default:
				System.out.println("Invalid Day");
        }
    }
}
