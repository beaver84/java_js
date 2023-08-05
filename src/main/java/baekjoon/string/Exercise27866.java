package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class Exercise27866 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int M = sc.nextInt();

        char result = str.charAt(M-1);

        System.out.println(result);
    }
}
