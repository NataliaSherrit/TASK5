package сalculator;

import java.util.Scanner;

public  class Operation {
    private static String operation;

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        operation = scanner.next();
        return operation;
    }
}

