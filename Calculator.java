package Cosmos;

public class Calculator {
    private int xTop;
    private static Calculator calculator = null;
    private int yTop;

    // Private constructor to prevent instantiation from other classes
    private Calculator() {
        System.out.println("Calculator initialized");
    }

    // Method to return the singleton instance of Calculator
    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    // Setter method for xTop
    public void setValueOfX(int x) {
        this.xTop = x;
    }

    // Setter method for yTop
    public void setValueOfY(int y) {
        this.yTop = y;
    }

    // Method to add xTop and yTop
    public int add() {
        return xTop + yTop;
    }
}