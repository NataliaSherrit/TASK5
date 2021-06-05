package сalculator;

public class Program {

    public static void main(String[] args) {
        double num1 = Numbers.getNum();
        double num2 = Numbers.getNum();
        String operation = Operation.getOperation();
        Calculator result = new Calculator(num1,num2,operation);

}
}
