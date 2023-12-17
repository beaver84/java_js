package java_basic.poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
//        //kakao 결제
//        String payOption1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(payOption1, amount1);
//        //naver 결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//        //잘못된 결제 수단 선택
//        String payOption3 = "bad";
//        int amount3 = 15000;
        Scanner scanner = new Scanner(System.in);
        String payOption;
        while(true) {
            System.out.print("결제 수단을 입력하세요: ");
            payOption = scanner.next();
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            payService.processPay(payOption, amount);
        }
    }
}
