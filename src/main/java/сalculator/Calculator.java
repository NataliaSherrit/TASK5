package сalculator;


public class Calculator {
   public static double result;

    public Calculator(double num1, double num2, String operation) {

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат равен " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат равен " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат равен " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Результат равен " + result);
                break;
            default:
                System.out.println("Операция не распознана.");
        }

    }
}