package сalculator;

import java.util.Scanner;

public class Numbers {
    private static double num;

    public static double getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        num = scanner.nextDouble();
        return num;
    }
}
