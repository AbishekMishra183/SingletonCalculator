package Cosmos;

public class MySing {
    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();
        calc.setValueOfX(2);
        calc.setValueOfY(3);

        Calculator calc2 = Calculator.getInstance();
        calc2.setValueOfY(4);
        calc2.setValueOfX(4);

        // Since calc and calc2 are the same instance, the following will print the same result
        System.out.println("Result " + calc.add());
        System.out.println("Result " + calc2.add());
    }
}
