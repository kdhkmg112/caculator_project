package calculator;

import java.util.ArrayList;

public class Calculator {
    static private ArrayList<Double> doubleList = new ArrayList<>();

    public static double calculate(int num1, int num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("분모가 0이므로 계산이 불가능합니다.");
                    break;
                } else {
                    result = (double) num1 / num2;
                    break;
                }
        }
        return result;
    }
}
