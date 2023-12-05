package kyh_first;

import java.util.Scanner;

public class condition_4_4 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("출력: x = " + num + ", 짝수");
        }else{
            System.out.println("출력: x = " + num + ", 홀수");
        }
    }
}
