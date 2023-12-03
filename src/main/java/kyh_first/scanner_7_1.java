package kyh_first;

import java.util.Scanner;

public class scanner_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요 : ");
        String name = scanner.next();
        System.out.println("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");

    }
}
