package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double[] results = new double[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

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
            System.out.println("결과: " + result);

            results[count] = result;
            count++;

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String checkExit = sc.next();
            if (checkExit.equals("exit")) {
                break;
            }
        }


    }
}
