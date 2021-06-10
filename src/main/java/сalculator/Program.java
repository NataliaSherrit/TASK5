package сalculator;

public class Program {

    public static void main(String[] args) throws Exception {
        double num1 = Numbers.getNum();
        double num2 = Numbers.getNum();
        String operation = Operation.getOperation();
        Calculator calc = new Calculator(num1,num2,operation);
        double result;
        result = Calculator.getResult();

    }
}
