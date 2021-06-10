package сalculator;


public class Calculator {
   public static double result;

    public Calculator(double num1, double num2, String operation) throws Exception {

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new Exception("На ноль делить нельзя");
                    }
                    else{
                            result = num1 / num2;
                        }
                    break;
                default:
                    System.out.println("Операция не распознана.");
            }
        }

    public static double getResult() {
        System.out.println("Результат равен " + result);
        return result;
    }
}