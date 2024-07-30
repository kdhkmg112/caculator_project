package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> doubleList;
    Calculator() {
         doubleList = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char operator) {
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
        doubleList.add(result);
        return result;
    }

    public void removeResult (double result,String str_remove) {
        if (str_remove.equals("remove")) {
            doubleList.remove(0);
        }
        return;
    }

    public void inquiryResult (String str_inquiry) {
        if (str_inquiry.equals("inquiry")) {
            for (double num : doubleList) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
