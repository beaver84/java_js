package kyh_first;

import java.util.Scanner;

public class array_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.print("입력한 정수의 합계 : " + sum);


        float avg = 0;
        for (int number : numbers) {
            avg = sum/(float)numbers.length;
        }
        System.out.print("입력한 정수의 평균 : " + avg);


    }
}
