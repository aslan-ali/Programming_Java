//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Calculate {
    public Calculate() {
    }

    public void calculate() {
        Scanner source = new Scanner(System.in);
        System.out.println("Select an operation: ");
        System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Division (/)\n4. Multiplication (*)\n");
        int operation = source.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your first number: ");
        int a = sc.nextInt();
        System.out.println("Write your second number: ");
        int b = sc.nextInt();
        Components components = new Components(a, b);
        int answer;
        if (operation == 1) {
            answer = components.addition();
            System.out.printf("The result of addition is: %d", answer);
        } else if (operation == 2) {
            answer = components.subtraction();
            System.out.printf("The result of subtraction is: %d", answer);
        } else if (operation == 3) {
            answer = components.division();
            System.out.printf("The result of division is: %d", answer);
        } else if (operation == 4) {
            answer = components.multiplication();
            System.out.printf("The result of multiplication is: %d", answer);
        }

    }
}

