package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<Double>();
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
            doubleList.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String str_remove = sc.next();
            if (str_remove.equals("remove")) {
                doubleList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String str_inquiry = sc.next();
            if (str_inquiry.equals("inquiry")) {
                for (double num : doubleList) {
                    System.out.print(num+" ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String checkExit = sc.next();
            if (checkExit.equals("exit")) {
                break;
            }
        }


    }
}
