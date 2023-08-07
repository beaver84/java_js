package baekjoon.string;

import java.util.Scanner;

public class Exercise11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String mToString = Integer.toString(m);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char c = mToString.charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);
    }
}
