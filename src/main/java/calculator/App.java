package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<Double>();
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            double result = calculator.calculate(num1, num2, operator);

            System.out.println("결과: " + result);


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String str_remove = sc.next();
            calculator.removeResult(result,str_remove);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String str_inquiry = sc.next();
            calculator.inquiryResult(str_inquiry);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String checkExit = sc.next();
            if (checkExit.equals("exit")) {
                break;
            }
        }


    }
}
