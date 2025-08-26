

import java.util.Scanner;

public class example1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is you name: ");
        String name = sc.nextLine();

        System.out.println("What is you age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + " Your age is " + age );

    }
}
